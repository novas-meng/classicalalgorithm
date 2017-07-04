/**
 * Created by mengfanshan on 2017/7/4.
 * bitmap���ݽṹ
 */
public class bitmap {
    public static void main(String[] args)
    {
        //�����������Ϊ400����ô51���ֽڵ�����Ϳ�������
        byte[] bytes=new byte[51];
        setI(1,bytes);
        setI(10,bytes);
        setI(111,bytes);
        setI(122,bytes);
        setI(15,bytes);
        setI(9,bytes);
        setI(56,bytes);
        setI(56,bytes);
        setI(56,bytes);
        setI(56,bytes);
        get(bytes);
        System.out.println(contain(101,bytes));

    }
    //����ĳ��������������Ӧλ���иı䣬����43����Ҫ������ĵ�6��Ԫ�صĵ�4��bitλ��1����ʾ43
    public static void setI(int index,byte[] bytes)
    {
        int count=index/8;
        int byteindex=index%8;
        byte b=1;
        b=(byte)(b<<(byteindex));
        bytes[count]=(byte)(bytes[count]|b);
    }
    //��ӡ�����а��������е����֣����α�������
    public static void get(byte[] bytes)
    {
        for (int i=0;i<bytes.length;i++)
        {
            byte b=bytes[i];
            for (int j=0;j<=7;j++)
            {
                int m=b&(1<<j);
                if(m!=0)
                {
                    int index=i*8+j;
                    System.out.println(index);
                }
            }
        }
    }
    //�ж�bitmap ���Ƿ����num
    public static boolean contain(int num,byte[] bytes)
    {
        int bytes_index=num/8;
        int bit_index=num%8;
        byte b=(byte)(bytes[bytes_index]&(1<<bit_index));
        if(b==0)
        {
            return false;
        }
        return true;


    }
}
