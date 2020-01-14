package linkedlist;

public class LRUBaseArray<T> {
	public static void main(String[] args) {
	   
	}
	private T[] array;
	int size;
	int capacity;
	static int DEFAULT_CAPACITY;
	//字段：容量 长度 Node跟节点
	//构造方法 添加 访问 删除 清空
	
	public LRUBaseArray(int capacity){
		this.capacity = capacity;
		array = (T[])new Object[capacity];
		size = 0;
	}
	
	public void Add(T element){
		//如果之前存在
			//将其右边
		//之前不存在
			//是否超过限制
				//删除最前元素
			//加到末尾
		int idx = FindPreIdx(element);
		if(idx !=-1){
			if(idx!=this.capacity-1){
				
			}
		}else{
			if(size>=capacity)
			{
				
			}
			
			
			//添加到最前
		}
		
		
		
	}

	private int FindPreIdx(T element) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
}
