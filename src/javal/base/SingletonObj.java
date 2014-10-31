package javal.base;



/****
 * 单例对像测试
 * @author: Artdi  
 * @date: 2014年5月15日 下午3:10:59
 * @version: V1.0 
 *
 */
public class SingletonObj {
	private SingletonObj(){System.out.println("假如初始化需要长时间。。。");}
	//实现方式1：使用同步信号量
	private static SingletonObj entity;
	public static synchronized SingletonObj getEntityBySynchronized(){
		if(entity==null){
			entity=new SingletonObj();
		}
		return entity;
	}
	
	//实现方式2：使用事态变量方式，类加载时进行初始化。
	private static SingletonObj staticEntity=new SingletonObj();
	public static SingletonObj getEntityByStatic(){
		return staticEntity;
	}
	
	//实现方式3：静态内部类	
	public static SingletonObj getEntityByStaticInternal (){
		return SingletonInternal.entity;		
	}
	private static class SingletonInternal{
		private static final SingletonObj entity=new SingletonObj();		
	}
	
}

