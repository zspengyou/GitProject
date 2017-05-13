## Subtree with Maximum Average

* use global varible (instance variable, to reduce the number of variable passed in.
* think twice about what to return 
* think twice about how to update the result 

* compare with current node or need to compare with root.left root.right
* when min, greater than => update 
* when max, less than => update


## be careful about global variable
http://www.lintcode.com/en/problem/maximum-depth-of-binary-tree/

## careful about break the old link
http://www.lintcode.com/en/problem/flatten-binary-tree-to-linked-list/

## for cyclic linked list
```
while (node.next != dummy.next) means ( while node is not the last node)
```

## number of islands 
```
 if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length)
```

## queue 

`offer, poll, isEmpty, size`

## don't forget to update the result
`result.add(tmpResult);// keep in mind, `

## two pointer
* think twice about when each of the pointer should move, 
* what is the boundary for each pointer, 
* how to deal with the value with the value when condition satisfies

## alid parentheses
* create stack
* getThePair


## note 
```
nums[i] or nums[j]
nums[len-1] or nums[len - i -1]
loop => i++
```
`subString(startIndex, startIndex+length  or endIndex + 1)`

`iterate linkedlist => current = current.next`

```java
if (node.val < node.next.val && x >= node.val && x <= node.next.val)
vs 
if (node.val > node.next.val && (x >= node.val || x <= node.next.val))

one is && the other is ||
```



git: gmail
leetcode: qq 