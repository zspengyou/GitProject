package lintCode;

/**
 * Created by lsphate on 11/10/15.
 */

import java.util.*;

public class Solution {
	public Solution() {}

	// Remove Vowel
	//    public String removeVowel(String s) {
	//        StringBuffer sb = new StringBuffer();
	//        Set<Character> hs = new HashSet<>(Arrays.asList(
	//                new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}));
	//        for (Character c : s.toCharArray()) {
	//            if (hs.contains(c))
	//                continue;
	//            sb.append(Character.toString(c));
	//        }
	//        return sb.toString();
	//    }

	// Right Rotation
	//    public int rightRotate(String word1, String word2) {
	//        if (word1 == null || word2 == null || word1.length() == 0 || word2.length() == 0 || word1.length() != word2.length()) {
	//            return -1;
	//        }
	//        String str = word1 + word1;
	//        return str.contains(word2) ? 1 : -1;
	//    }
	//TODO
	////=========================================================================================
	// Grey Code
	//    public int greyCode(byte element1, byte element2) {
	//        byte res = (byte) (element1 ^ element2);
	//        for (int i = 0; i <= 7; i++) {
	//            byte temp = (byte) (1 << i);
	//            if (temp == res) {
	//                System.out.println("Yes");
	//                return 1;
	//            }
	//        }
	//        System.out.println("No");
	//        return 0;
	//    }

	// Longest Palindrome Substring
	public String longestPalindrome(String s) {
		char[] chars = s.toCharArray();
		int len = s.length();
		while (len >= 0) {
			for (int i = 0; i + len - 1 < chars.length; i++) {
				int left = i;
				int right = i + len - 1;
				boolean good = true;
				while (left < right) {
					if (chars[left] != chars[right]) {
						good = false;
						break;
					}
					left++;
					right--;
				}
				if (good)
					return s.substring(i, i + len);
			}
			--len;
		}
		return "";
	}

//	// Merge Two List
//	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//		ListNode head = new ListNode(0);
//		ListNode cur = head;
//		while (l1 != null && l2 != null) {
//			if (l1.val < l2.val) {
//				cur.next = l1;
//				l1 = l1.next;
//			} else {
//				cur.next = l2;
//				l2 = l2.next;
//			}
//			cur = cur.next;
//		}
//		cur.next = (l1 != null) ? l1 : l2;
//		return head.next;
//	}

//	// Reverse Half List
//	public ListNode reverseSecondHalfList(ListNode head) {
//		if (head == null || head.next == null)
//			return head;
//		ListNode fast = head;
//		ListNode slow = head;
//		while (fast.next != null && fast.next.next != null) {
//			fast = fast.next.next;
//			slow = slow.next;
//		}
//		ListNode pre = slow.next;
//		ListNode cur = pre.next;
//		while (cur != null) {
//			pre.next = cur.next;
//			cur.next = slow.next;
//			slow.next = cur;
//			cur = pre.next;
//		}
//		return head;
//	}

//	// Sub Tree
//	public boolean isSubTree(TreeNode T1, TreeNode T2) {
//		if (T2 == null)
//			return true;
//		if (T1 == null)
//			return false;
//		return (isSameTree(T1, T2) || isSubTree(T1.left, T2) || isSubTree(T1.right, T2));
//	}
//
//	public boolean isSameTree(TreeNode T1, TreeNode T2) {
//		if (T1 == null && T2 == null)
//			return true;
//		if (T1 == null || T2 == null)
//			return false;
//		if (T1.val != T2.val)
//			return false;
//		return (isSameTree(T1.left, T2.left) && isSameTree(T1.right, T2.right));
//	}

	//	// Two Sum
	//	public int TwoSumCount(int[] nums, int target) {
	//		if (nums == null || nums.length < 2)
	//			return 0;
	//		Map<Integer, Integer> map = new HashMap<>();
	//		int count = 0;
	//		for (int i = 0; i < nums.length; i++) {
	//			if (map.containsKey(target - nums[i]))
	//				count += map.get(target - nums[i]);
	//			if (!map.containsKey(nums[i]))
	//				map.put(nums[i], 1);
	//			else
	//				map.put(nums[i], map.get(nums[i]) + 1);
	//		}
	//		return count;
	//	}

	
//	////TODO
//	// Overlap Rectangle
//	// Rect 1: top-left(A, B), bottom-right(C, D)
//	// Rect 2: top-left(E, F), bottom-right(G, H)
//	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
//		int innerL = Math.max(A, E);
//		int innerR = Math.max(innerL, Math.min(C, G));
//		int innerT = Math.max(B, F);
//		int innerB = Math.max(innerT, Math.min(D, H));
//		return (C - A) * (B - D) - (innerR - innerL) * (innerT - innerB) + (G - E) * (F - H);
//	}

//	// Window Sum
//	public List<Integer> GetSum(List<Integer> A, int k) {
//		ArrayList<Integer> result = new ArrayList<>();
//		if (A == null || A.size() == 0 || k <= 0)
//			return result;
//		int count = 0;
//		for (int i = 0; i < A.size(); i++) {
//			count++;
//			if (count >= k) {
//				int sum = 0;
//				for (int j = i; j >= i - k + 1; j--) {
//					sum += A.get(j);
//				}
//				result.add(sum);
//			}
//		}
//		return result;
//	}

	// Valid Parentheses
	public boolean isValid(String s) {
		char[] charArray = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (stack.empty())
				stack.push(s.charAt(i));
			else if (s.charAt(i) - stack.peek() == 1 || s.charAt(i) - stack.peek() == 2)
				stack.pop();
			else
				stack.push(s.charAt(i));
		}
		return stack.empty();
	}

	// CKPoints
	public Point[] closestKPoints(Point[] arr, int k) {
		if (k == 0) {
			return new Point[0];
		}
		PriorityQueue<Point> minHeap = new PriorityQueue<>(k, new Comparator<Point>() {
			@Override
			public int compare(Point a, Point b) {
				double disa = a.x * a.x + a.y * a.y;
				double disb = b.x * b.x + b.y * b.y;
				// return disa < disb ? -1 : (disa > disb ? 1 : 0);
				if (disb > disa) {
					return -1;
				} else if (disb < disa) {
					return 1;
				} else {
					return 0;
				}
			}
		});

		for (Point p : arr) {
			minHeap.add(p);
		}
		Point[] res = new Point[k];
		for (int i = 0; i < k; i++) {
			res[i] = minHeap.poll();
		}
		return res;
	}
}
