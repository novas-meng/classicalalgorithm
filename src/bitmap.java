/**
 * Created by mengfanshan on 2017/7/4.
 * bitmap数据结构
 */
public class bitmap {
    public static void main(String[] args)
    {
        //假设数据最大为400，那么51个字节的数组就可以容纳
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

    }
    public static void setI(int index,byte[] bytes)
    {
        int count=index/8;
        int byteindex=index%8;
        byte b=1;
        b=(byte)(b<<(byteindex));
        bytes[count]=(byte)(bytes[count]|b);
    }
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
}
