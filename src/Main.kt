
fun main() {

    val binary = BST<Int>()
    binary.add(30)
    binary.add(13)
    binary.add(19)
    binary.add(2)
    binary.add(3)
    println(traverseDepthFirst(binary))
}