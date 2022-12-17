function doLime() {
    let dd1 = document.getElementById('d1')
    dd1.style.backgroundColor = 'lime'
    let ctx = dd1.getContext('2d')
    

}

function doYellow() {
    let dd1 = document.getElementById('d1')
    dd1.style.backgroundColor = 'white'
    let ctx = dd1.getContext('2d')
    ctx.fillStyle = 'yellow'
    ctx.fillRect(10, 10, 40, 40)
    ctx.fillRect(60, 10, 40, 40)

    ctx.fillStyle = 'black'
    ctx.font = '1rem Arial'
    ctx.fillText('Hello', 10, 30)

}

function doColor() {
    let dd1 = document.getElementById('d1')
    let input = document.getElementById('colorInput')
    let color = input.value
    dd1.style.backgroundColor = color
}

function doRect () {
    let dd1 = document.getElementById('d1')
    let input = document.getElementById('rangeInput')
    let size = input.value
    let ctx = dd1.getContext('2d')
    ctx.clearRect(10, 10, dd1.width, dd1.height)
    ctx.fillStyle = 'yellow'
    ctx.fillRect(10, 10, size * 2, size)

}