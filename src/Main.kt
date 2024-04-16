import algorithims.sorting.bubbleSort
import algorithims.sorting.insertionSort
import algorithims.sorting.selectionSort

fun main() {
//    val binary = BST<Int>()
//    binary.add(30)
//    binary.add(13)
//    binary.add(19)
//    binary.add(2)
//    binary.add(3)
//    println(traverseDepthFirstInOrder(binary))
    val list = mutableListOf(1,3,6,78,5,46)
    println(insertionSort(list))
}