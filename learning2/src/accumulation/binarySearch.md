## template: 	
### `if(end - start >= 2)`	
* `start < mid = start + (end - start)/2 < end`
* => every time mid is different from start and end
* => every time **start** will be less than **end**

## traditional: 	
### `start < end`
* `start <= mid = start + (end - start)/2 < end`
* if start = mid + 1 ==> start <= end
* if end = mid -1, end <=start


## test1: all greater than target
* traditional: start = 0; end = -1 or 0
* template: start = 0; end = 1

## test2: all less than 
* traditional: start = n-2, end = n -1
* template: start = n-2, end = n-2;

## test3: all equal to target
* traditional: 
	* if move end, start = 0, end = 0
	* if move start, start = n-2, end = n-1
* template:
	* if move end: start = 0; end = 1
	* if move start: start = n-2, end = n-1


## for template
### find first
```
	when equal
		=> end = mid;
	when break out	
		=> check start
		=> check end
		=> return invalid
```
### find last

```
	when equal
		=> start = mid;
	when break out
		=> check end
		=> check start
		=> return invalid
```		

## for traditional 
### find first
```
	when equal	
		=> end = mid
   	when break out 	
   		=> check start
   		=> check end is valid and check end
   		=> return invalid
```

### find last
```
	when equal 	
		=> start = mid  ( double check to avoid infinite loop)
	when break out 	
		=> check end is valid, check end
		=> check start
		=> return invalid	
```

