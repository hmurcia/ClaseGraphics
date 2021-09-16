function polygon(a, colorBorde, colorRelleno) {   // a = [20, 12, 34, 56, 78, 90, 112, 167, 34, 56]
  ctx.beginPath()
  ctx.strokeStyle = colorBorde
  ctx.fillStyle = colorRelleno
  ctx.moveTo(a[0],a[1])
  for (i=2; i < a.length; i+=2)
    ctx.lineTo(a[i],a[i+1]);
  ctx.closePath()
  ctx.stroke()
  ctx.fill()
}

function arrPolyReg(x, y, n, r1, r2) {
  a = Math.PI/n
  at = 0
  v = []
  for (i=0; i<=2*n; i++) {
    rr = i % 2 ? r1 : r2
    v.push(rr * Math.sin(at+=a) + x)
    v.push(rr * Math.cos(at) + y)
  }
  return v
}

function triangle(x1, y1, x2, y2, x3, y3, colorBorde, colorRelleno) {
  polygon([x1,y1,x2,y2,x3,y3], colorBorde, colorRelleno)
}

// Retorna un número aleatorio entre min (incluido) y max (excluido)
function getRandomArbitrary(min, max) {
  return Math.random() * (max - min) + min;
}

// Retorna un entero aleatorio entre min (incluido) y max (excluido)
// ¡Usando Math.round() te dará una distribución no-uniforme!
function getRandomInt(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}
