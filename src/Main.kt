
fun main() {

    val binary = BST<Int>()
    binary.add(3)
    binary.add(30)
    binary.add(13)
    binary.add(19)
    binary.add(2)
    println(binary.contains( 2))
    println(binary.root?.right?.left?.right?.data)
}