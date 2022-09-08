import java.util.Scanner;
class calc2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter calculation with max operations 4");
        String inp = sc.nextLine();
        String cas = " ";
        
        String fo = " ";
        String so = " ";
        String to = " ";
        String fro = " ";
        String fio = " ";
        
        int rs = 0;
        
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        
        int a = 0; //0 = empty, 1 = add , 2 = sub , 3 = multiply , 4 = divide
        int b = 0;
        int c = 0;
        int d = 0;
        
        int x = 1;
        for(int i=0 ; i<=inp.length()-1 ; i++)
        {
            char ch = inp.charAt(i);
            if(ch == '+')
            {
                if(x == 1)
                {
                    a = 1;
                }
                else if(x == 2)
                {
                    b = 1;
                }
                else if(x == 3)
                {
                    c = 1;
                }
                else if(x == 4)
                {
                    d = 1;
                }
                x++;
            }
            else
            {
                b1 = false;
            }
            // LINE END
            if(ch == '-')
            {
                if(x == 1)
                {
                    a = 2;
                }
                else if(x == 2)
                {
                    b = 2;
                }
                else if(x == 3)
                {
                    c = 2;
                }
                else if(x == 4)
                {
                    d = 2;
                }
                x++;
            }
            else
            {
                b2 = false;
            }
            // LINE END
            if(ch == 'x')
            {
                if(x == 1)
                {
                    a = 3;
                }
                else if(x == 2)
                {
                    b = 3;
                }
                else if(x == 3)
                {
                    c = 3;
                }
                else if(x == 4)
                {
                    d = 3;
                }
                x++;
            }
            else
            {
                b3 = false;
            }
            // LINE END
            if(ch == '/')
            {
                if(x == 1)
                {
                    a = 4;
                }
                else if(x == 2)
                {
                    b = 4;
                }
                else if(x == 3)
                {
                    c = 4;
                }
                else if(x == 4)
                {
                    d = 4;
                }
                x++;
            }
            else
            {
                b4 = false;
            }
            // LINE END
            
            
            
            
            if(b1 == false && b2 == false && b3 == false && b4 == false && x==1)
            {
                if(ch == '+')
                {
                    
                }
                else
                {
                    if(ch == '-')
                    {
                        
                    }
                    else
                    {
                        if(ch == 'x')
                        {
                            
                        }
                        else
                        {
                            if(ch == '/')
                            {
                                
                            }
                            else
                            {
                                fo = fo+ch;
                            }
                        }
                    }
                }
            }
            
            if(b1 == false && b2 == false && b3 == false && b4 == false && x==2)
            {
                if(ch == '+')
                {
                    
                }
                else
                {
                    if(ch == '-')
                    {
                        
                    }
                    else
                    {
                        if(ch == 'x')
                        {
                            
                        }
                        else
                        {
                            if(ch == '/')
                            {
                                
                            }
                            else
                            {
                                so = so+ch;
                            }
                        }
                    }
                }
            }
            
            if(b1 == false && b2 == false && b3 == false && b4 == false && x==3)
            {
                if(ch == '+')
                {
                    
                }
                else
                {
                    if(ch == '-')
                    {
                        
                    }
                    else
                    {
                        if(ch == 'x')
                        {
                            
                        }
                        else
                        {
                            if(ch == '/')
                            {
                                
                            }
                            else
                            {
                                to = to+ch;
                            }
                        }
                    }
                }
            }
            
            if(b1 == false && b2 == false && b3 == false && b4 == false && x==4)
            {
                if(ch == '+')
                {
                    
                }
                else
                {
                    if(ch == '-')
                    {
                        
                    }
                    else
                    {
                        if(ch == 'x')
                        {
                            
                        }
                        else
                        {
                            if(ch == '/')
                            {
                                
                            }
                            else
                            {
                                fro = fro+ch;
                            }
                        }
                    }
                }
            }
            
            if(b1 == false && b2 == false && b3 == false && b4 == false && x==5)
            {
                if(ch == '+')
                {
                    
                }
                else
                {
                    if(ch == '-')
                    {
                        
                    }
                    else
                    {
                        if(ch == 'x')
                        {
                            
                        }
                        else
                        {
                            if(ch == '/')
                            {
                                
                            }
                            else
                            {
                                fio = fio+ch;
                            }
                        }
                    }
                }
            }
        }
        fo = fo.trim();
        so = so.trim();
        to = to.trim();
        fro = fro.trim();
        fio = fio.trim();
        
        if(x == 2)
        {
        int n1 = Integer.parseInt(fo);
        int n2 = Integer.parseInt(so);
            if(a == 1)
        {
            rs = n1+n1;
        }
        else if(a == 2)
        {
            rs = n1-n1;
        }
        else if(a == 3)
        {
            rs = n1*n1;
        }
        else if(a == 4)
        {
            rs = n1/n1;
        }
        }
        //NEW OP
        else if(x == 3)
        {
        int n1 = Integer.parseInt(fo);
        int n2 = Integer.parseInt(so);
        int n3 = Integer.parseInt(to);
            if(a == 1)
        {
            rs = n1+n1;
        }
        else if(a == 2)
        {
            rs = n1-n1;
        }
        else if(a == 3)
        {
            rs = n1*n1;
        }
        else if(a == 4)
        {
            rs = n1/n1;
        }
        
        if(b == 1)
        {
            rs = rs+n3;
        }
        else if(b == 2)
        {
            rs = rs-n3;
        }
        else if(b == 3)
        {
            rs = rs*n3;
        }
        else if(b == 4)
        {
            rs = rs/n3;
        }
        }
        //NEW OP
        else if(x == 4)
        {
        int n1 = Integer.parseInt(fo);
        int n2 = Integer.parseInt(so);
        int n3 = Integer.parseInt(to);
        int n4 = Integer.parseInt(fro);
                        if(a == 1)
        {
            rs = n1+n1;
        }
        else if(a == 2)
        {
            rs = n1-n1;
        }
        else if(a == 3)
        {
            rs = n1*n1;
        }
        else if(a == 4)
        {
            rs = n1/n1;
        }
        
        if(b == 1)
        {
            rs = rs+n3;
        }
        else if(b == 2)
        {
            rs = rs-n3;
        }
        else if(b == 3)
        {
            rs = rs*n3;
        }
        else if(b == 4)
        {
            rs = rs/n3;
        }
        if(c == 1)
        {
            rs = rs+n4;
        }
        else if(c == 2)
        {
            rs = rs-n4;
        }
        else if(c == 3)
        {
            rs = rs*n4;
        }
        else if(c == 4)
        {
            rs = rs/n4;
        }
        }
        //NEW OP
        else if(x == 5)
        {
        int n1 = Integer.parseInt(fo);
        int n2 = Integer.parseInt(so);
        int n3 = Integer.parseInt(to);
        int n4 = Integer.parseInt(fro);
        int n5 = Integer.parseInt(fio);
        if(a == 1)
        {
            rs = n1+n1;
        }
        else if(a == 2)
        {
            rs = n1-n1;
        }
        else if(a == 3)
        {
            rs = n1*n1;
        }
        else if(a == 4)
        {
            rs = n1/n1;
        }
        
        if(b == 1)
        {
            rs = rs+n3;
        }
        else if(b == 2)
        {
            rs = rs-n3;
        }
        else if(b == 3)
        {
            rs = rs*n3;
        }
        else if(b == 4)
        {
            rs = rs/n3;
        }
        if(c == 1)
        {
            rs = rs+n4;
        }
        else if(c == 2)
        {
            rs = rs-n4;
        }
        else if(c == 3)
        {
            rs = rs*n4;
        }
        else if(c == 4)
        {
            rs = rs/n4;
        }
        if(d == 1)
        {
            rs = rs+n5;
        }
        else if(d == 2)
        {
            rs = rs-n5;
        }
        else if(d == 3)
        {
            rs = rs*n5;
        }
        else if(d == 4)
        {
            rs = rs/n5;
        }
        }
        /* THESE WHERE THE CHECKS USED TO TEST THE PROGRAM WHEN I WAS PROGRAMING IT
        System.out.println("x = "+x);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        
        System.out.println("FO = "+fo);
        System.out.println("SO = "+so);
        System.out.println("TO = "+to);
        System.out.println("FRO = "+fro);
        System.out.println("FIO = "+fio);
        */
        System.out.println("ans = "+rs);
    }
}