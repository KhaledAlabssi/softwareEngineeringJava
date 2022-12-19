let fgImage = null;
let bgImage = null;
let output = null;
let fgCanvas = document.getElementById('fgCanvas')
let bgCanvas = document.getElementById("bgCanvas")

function loadBgImage() {
    let file = document.getElementById('bgInput')
    bgImage = new SimpleImage(file)
    bgImage.drawTo(bgCanvas)

}

function loadFgImage() {
    let file = document.getElementById("fgInput")
    fgImage = new SimpleImage(file)
    output = new SimpleImage(file)

    fgImage.drawTo(fgCanvas)

}

function doGreenScreen() {
    for (let p of output.values()) {
        let x = p.getX()
        let y = p.getY()
        if (p.getGreen() > (p.getRed() + p.getBlue())) {
            let newPixel = bgImage.getPixel(x, y)
            output.setPixel(x, y, newPixel)
        }
    }
    clearCanvas()
    output.drawTo(fgCanvas)




}

function clearCanvas() {
    let ctx = fgCanvas.getContext('2d')
    ctx.clearRect(0, 0, fgCanvas.width, fgCanvas.height)
    ctx = bgCanvas.getContext("2d")
    ctx.clearRect(0, 0, bgCanvas.width, bgCanvas.height)

}