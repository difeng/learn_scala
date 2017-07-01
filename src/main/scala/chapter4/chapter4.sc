val symbols = Array("<","-",">")
val counts = Array(2,10,2)
val pairs = symbols.zip(counts)
for ((s,n) <- pairs) print(s * n)

"Hello".zip("Hello")

val toolsPriceMap = Map("A" -> 100,"B" -> 200)

for((k,v) <- toolsPriceMap) yield (k,0.9 * v)



