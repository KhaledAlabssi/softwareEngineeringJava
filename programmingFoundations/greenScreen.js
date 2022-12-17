// write your code here
const fgImage = new SimpleImage("rocket.jpg")
const bgImage = new SimpleImage("space.jpg")
const output = new SimpleImage(fgImage.getWidth(), fgImage.getHeight())
// print(output.getWidth())
for (let p of fgImage.values()) {
  let x = p.getX()
  let y = p.getY()
  if (p.getGreen() > p.getRed() + p.getBlue() + 10) {
    let bgPixel = bgImage.getPixel(x, y)
    output.setPixel(x, y, bgPixel)
  } else {
    output.setPixel(x, y, p)
  }
}
print(output)
