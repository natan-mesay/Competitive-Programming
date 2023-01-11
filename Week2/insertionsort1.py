def printList(arr):
    for i in arr:
        print(i, end = " ")
    print()

def insertionSort1(n, arr):
    # Write your code here
    var = arr[-1]
    j = n - 1
    while j > 0 and arr[j - 1] > var:
        arr[j] = arr[j - 1]
        j -= 1
        printList(arr)
    arr[j] = var
    printList(arr)