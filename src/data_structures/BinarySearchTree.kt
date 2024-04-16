package data_structures

class BinaryNode<T:Comparable<T>>(val data:T) {
    var left: BinaryNode<T>? = null
    var right: BinaryNode<T>? = null
}

class BST<T:Comparable<T>>{
    var root: BinaryNode<T>? = null
     fun add(value: T) {
        val newNode = BinaryNode<T>(value)

        if (root == null) {
            root = newNode
            return
        }

         var current: BinaryNode<T> = root ?: return

         while (true) {
             if(current.data == value){
                 return
             }else if(value < current.data){
                 if (current.left == null) {
                     current.left = newNode
                     return
                 }
                 current = current.left!!

             }else if( value > current.data){
                 if (current.right == null) {
                     current.right = newNode
                     return
                 }
                 current = current.right!!
             }
         }
     }

    fun contains(value: T): Boolean {
        var current = root

        while (true) {
            if (current == null) {
                break
            } else if (current.data == value) {
                return true
            } else if (value < current.data) {
                current = current.left
            } else if (value > current.data) {
                current = current.right
            }
        }
        return false
    }

    fun isEmpty() = root == null

}


