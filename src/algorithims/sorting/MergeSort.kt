package algorithims.sorting


fun mergeSort(arr: IntArray) {
    mergeSort(arr, 0, arr.size - 1)
}

fun mergeSort(arr: IntArray, low: Int, high: Int) {
    if (low < high) {
        val mid = (low + high) / 2
        mergeSort(arr, low, mid)
        mergeSort(arr, mid + 1, high)
        merge(arr, low, mid, high)
    }
}

fun merge(arr: IntArray, low: Int, mid: Int, high: Int) {
    val leftSize = mid - low + 1
    val rightSize = high - mid

    // Create temporary arrays to hold the left and right halves
    val leftArray = IntArray(leftSize)
    val rightArray = IntArray(rightSize)

    // Copy data to temporary arrays
    for (i in 0 until leftSize) {
        leftArray[i] = arr[low + i]
    }
    for (j in 0 until rightSize) {
        rightArray[j] = arr[mid + 1 + j]
    }

    // Merge the temporary arrays back into the original array
    var i = 0  // Index for the leftArray
    var j = 0  // Index for the rightArray
    var k = low // Index for the merged array

    while (i < leftSize && j < rightSize) {
        if (leftArray[i] <= rightArray[j]) {
            arr[k++] = leftArray[i++]
        } else {
            arr[k++] = rightArray[j++]
        }
    }

    // Copy remaining elements of leftArray, if any
    while (i < leftSize) {
        arr[k++] = leftArray[i++]
    }

    // Copy remaining elements of rightArray, if any
    while (j < rightSize) {
        arr[k++] = rightArray[j++]
    }
}