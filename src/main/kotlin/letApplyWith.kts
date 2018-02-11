package demo

println ("Margo".let { it.length })
println ("Margo".apply { length })
println ("Margo".run { length })
println ("Margo".also { it.length })

println (with("Margo") { length })
println (run {"Margo".length})