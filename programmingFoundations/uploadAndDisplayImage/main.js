let image;
let outputImage;
function upload() {
    let value = document.getElementById('imageInput')
    // alert(value)
    image = new SimpleImage(value)
    outputImage = new SimpleImage(value)
    let canvas = document.getElementById('canvas')
    image.drawTo(canvas)
}

function makeGray () {
    let canvas = document.getElementById('canvas-output')
    for(let p of outputImage.values()){
        let avg = (p.getRed() + p.getGreen() + p.getBlue()) / 3
        p.setRed(avg)
        p.setGreen(avg)
        p.setBlue(avg)

    }
    outputImage.drawTo(canvas)

}

function download () {
    let canvas = document.getElementById('canvas-output')
    // let dataURL = canvas.toDataURL('image/png')
    // let newTab = window.open('about:blank', 'image from canvas')
    // newTab.document.write("<img src='" + dataURL + "' alt='from canvas' />")
    var anchor = document.createElement('a');
        anchor.href = canvas.toDataURL('image/png'); // 'image/jpg'
        anchor.download = 'image.png';               // 'image.jpg'
        anchor.click();
}