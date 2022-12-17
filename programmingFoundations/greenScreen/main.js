var image

function choose() {
  var fileinput = document.getElementById("finput")
  var filename = fileinput.value
  alert("Chose" + filename)
}

function upload() {
  var canvas = document.getElementById("can")
  var fileinput = document.getElementById("finput")
  image = new SimpleImage(fileinput)
  image.drawTo(canvas)
}

function makeGray() {
  for (var pixel of image.values()) {
    var x = pixel.getX()
    var y = pixel.getY()
    var a = pixel.getRed()
    var b = pixel.getGreen()
    var c = pixel.getBlue()
    var avg = (a + b + c) / 3
    pixel.setRed(avg)
    pixel.setGreen(avg)
    pixel.setBlue(avg)
  }

  var canvas = document.getElementById("can")
  image.drawTo(canvas)
}
