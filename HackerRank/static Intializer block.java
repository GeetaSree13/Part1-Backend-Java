
    static int B;
    static int H;
    static boolean flag;
    static{
        Scanner sc=new Scanner(System.in);
        B=sc.nextInt();
        H=sc.nextInt();
        if(H>0 && B>0)
        {flag=true;
        }
        else if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

