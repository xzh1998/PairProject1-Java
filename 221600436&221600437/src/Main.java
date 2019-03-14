public class Main {

    public static void main(String args[]){//-i G:\my\input.txt
        //System.out.println("hello fuck!");
        long start,end;
        start = System.currentTimeMillis();

        String inputFileName="input.txt",outputFileName="Result.txt";
        int n=10,CodeMode=0;
        Result tempresult=new Result();
        for (int i=0;i<args.length;i++) {
            switch (args[i]){
                case"-i":
                    System.out.format("input filename:%s\n",args[i+1]);
                    inputFileName=args[i+1];
                    break;
                case "-o":
                    System.out.format("output filename:%s\n",args[i+1]);
                    outputFileName=args[i+1];
                    break;
                case "-n":
                    System.out.format("%s自定义词频统计输出\n",args[i+1]);
                    n=Integer.valueOf(args[i+1]);
                    break;
                case "-G":
                    System.out.format("Gbk");
                    CodeMode=1;
                    break;
                case "-h":
                    System.out.format("Help");
                    break;
            }
        }
        Process.read_file(inputFileName,outputFileName,tempresult, CodeMode,n);

//        String temp;
//        Scanner sc = new Scanner(System.in);
//        temp=sc.nextLine();

        end = System.currentTimeMillis();
        System.out.println("start time:" + start+ "; end time:" + end+ "; Run Time:" + (end - start) + "(ms)");
    }
}
