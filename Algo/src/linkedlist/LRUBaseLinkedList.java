package linkedlist;



public class LRUBaseLinkedList <T>{
	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		Solution solution = new Solution();
		node.next = new ListNode(2);
		node.next.next= new ListNode(1);
		System.out.print( solution.isPalindrome(node)+" sss");
	}
	LRUBaseLinkedListNode head;
	int size;
	int capacity;
	static int DEFAULT_CAPACITY;
	//字段：容量 长度 Node跟节点
	//构造方法 添加 访问 删除 清空
	
	public LRUBaseLinkedList(int capcity){
		this.capacity = capacity;
		size = 0;
	}
	
	public void Add(T element){
		//先找到是否有存在的节点
		
		if(size<capacity)
		{
			//添加到最前
			
		}
		else{
			//删除末尾
		}
		
		
	}
	
	
	
	
	
	public class LRUBaseLinkedListNode<T>{
		public LRUBaseLinkedListNode next;
		private T element;
		public LRUBaseLinkedListNode(T item){
			this.element = item;
		}
		public T getElement(){
			return element;
		}
		
		public void setElement(T item){
			this.element = item;
		}
		
		public void setNext(LRUBaseLinkedListNode node){
			this.next = node;
		}
		//get setelement set next 
		
	}
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
class Solution {
  public boolean isPalindrome(ListNode head) {
	  if(head == null)return false;
	  ListNode current = head;
	  ListNode tail = new ListNode(head.val);
	  ListNode new_head = tail;
	  while(current.next!=null){
		  ListNode node =new ListNode(current.next.val);
		  node.next = tail;
		  tail = node;
		  new_head = node;
		  current = current.next;
	  }
	  current = head;
	  ListNode new_current = new_head;
	  while(current !=null){
		  if(current.val != new_current.val){
			  return false;
		  }
		  current = current.next;
		  new_current = new_current.next;
	  }
	  
	  
	  return true;
  }
  }