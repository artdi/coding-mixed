package javal.base;



/****
 * �����������
 * @author: Artdi  
 * @date: 2014��5��15�� ����3:10:59
 * @version: V1.0 
 *
 */
public class SingletonObj {
	private SingletonObj(){System.out.println("�����ʼ����Ҫ��ʱ�䡣����");}
	//ʵ�ַ�ʽ1��ʹ��ͬ���ź���
	private static SingletonObj entity;
	public static synchronized SingletonObj getEntityBySynchronized(){
		if(entity==null){
			entity=new SingletonObj();
		}
		return entity;
	}
	
	//ʵ�ַ�ʽ2��ʹ����̬������ʽ�������ʱ���г�ʼ����
	private static SingletonObj staticEntity=new SingletonObj();
	public static SingletonObj getEntityByStatic(){
		return staticEntity;
	}
	
	//ʵ�ַ�ʽ3����̬�ڲ���	
	public static SingletonObj getEntityByStaticInternal (){
		return SingletonInternal.entity;		
	}
	private static class SingletonInternal{
		private static final SingletonObj entity=new SingletonObj();		
	}
	
}

