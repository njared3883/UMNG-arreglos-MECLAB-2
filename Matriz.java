package matriz;
import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner (System.in);
        int a=0, b=0, marilu=0, sofia=0, ema=0, sara=999, la=0, masi=0;
        int [][] mat= new int[100][100];
        int [][] joy= new int[100][100];
        double [] cri= new double[10000];
        double [] liz= new double [5000];
        double [] sam= new double [5000];
        double mar, luz;
        long startTime;
        long [][] esmeralda= new long[4][5];
        System.out.println("Que se desea realizar, punto 1 o punto 2 o punto 3");
        la= ingreso.nextInt();
        if(la==1){
        System.out.println("Que tan grande es la matriz a usar");
        a= ingreso.nextInt();
        b= ingreso.nextInt();
        System.out.println("seleccione '1' para vectores aleatoria o '2' para dar los datos");
            marilu= ingreso.nextInt();
            switch(marilu){
                case 1:
                    System.out.println("ingrese los datos de la matriz");
                    for(int x=0; x<a; x++){
                        for(int y=0; y<b; y++){
                            mat[x][y]= (int) (Math.random() * sara);
                        }
                    }
                    System.out.println("____________________________");
                    System.out.println("esta es la matriz a utilizar");
                    for(int x=0; x<a; x++){
                        for(int y=0; y<b; y++){
                            System.out.print(mat[x][y]+"    ");
                        }
                        System.out.println("");
                    }
                break;
                case 2:
                    System.out.println("ingrese los datos de la matriz");
                    for(int x=0; x<a; x++){
                        for(int y=0; y<b; y++){
                            mat[x][y]= ingreso.nextInt();
                        }
                    }
                    System.out.println("____________________________");
                    System.out.println("esta es la matriz a utilizar");
                    for(int x=0; x<a; x++){
                        for(int y=0; y<b; y++){
                            System.out.print(mat[x][y]+"    ");
                        }
                        System.out.println("");
                    }
                break;
            }
        System.out.println("seleccione '1' para suma entre matrices");
        System.out.println("seleccione '2' para producto entre matrices");
        System.out.println("seleccione '3' para producto con un escalar");
        System.out.println("seleccione '4' para trasponer una matriz");
        marilu= ingreso.nextInt();
        switch(marilu){
            case 1:
                System.out.println("ingrese los datos de una segunda matriz");
                for(int x=0; x<a; x++){
                    for(int y=0; y<b; y++){
                        joy[x][y]= ingreso.nextInt();
                    }
                }
                System.out.println("____________________________");
                System.out.println("este es el resultado de la operacion");
                for(int x=0; x<a; x++){
                    for(int y=0; y<b; y++){
                        System.out.print(mat[x][y] + joy[x][y]+ "    ");
                    }
                    System.out.println("");
                }
            break;
            case 2:
                System.out.println("ingrese los datos de una segunda matriz");
                for(int x=0; x<a; x++){
                    for(int y=0; y<b; y++){
                        joy[x][y]= ingreso.nextInt();
                    }
                }
                System.out.println("____________________________");
                System.out.println("este es el resultado de la operacion");
                for(int x=0; x<a; x++){
                    for(int y=0; y<b; y++){
                        System.out.print(mat[x][y] * joy[x][y]+ "    ");
                    }
                    System.out.println("");
                }
            break;
            case 3:
                System.out.println("ingrese el valor del escalar");
                sofia= ingreso.nextInt();
                System.out.println("____________________________");
                System.out.println("este es el resultado de la operacion");
                for(int x=0; x<a; x++){
                    for(int y=0; y<b; y++){
                        System.out.print(mat[x][y] * sofia + "    ");
                    }
                    System.out.println("");
                }
            break;
            case 4:
                System.out.println("____________________________");
                System.out.println("este es el resultado de la operacion");
                for(int x=0; x<a; x++){
                    for(int y=0; y<b; y++){
                        joy[x][y]=mat[y][x];
                        System.out.print(joy[x][y]+ "    ");
                    }
                    System.out.println("");
                }
            break;
        }
        }
        if(la==2){
            do{
            System.out.println("Que tan grande es el vector a usar");
            System.out.println("1-100, 2-500, 3-1000, 4-5000, 5-10000");
            marilu= ingreso.nextInt();
            switch(marilu){
                case 1:
                    b=100;
                    System.out.println("el tamaño del vector es de: "+b);
                break;
                case 2:
                    b=500;
                    System.out.println("el tamaño del vector es de: "+b);
                break;
                case 3:
                    b=1000;
                    System.out.println("el tamaño del vector es de: "+b);
                break;
                case 4:
                    b=5000;
                    System.out.println("el tamaño del vector es de: "+b);
                break;
                case 5:
                    b=10000;
                    System.out.println("el tamaño del vector es de: "+b);
                break;
            }
            System.out.println("seleccione '1' para vectores aleatoria o '2' para dar los datos");
            for(int y=0; y<b; y++){
                cri[y]= Math.random() * sara;
            }
            System.out.println("seleccione el metodo de ordenamiento que desee para organizar de menor a mayor");
            System.out.println("1 para el mertodo de insercion");
            System.out.println("2 para el mertodo de seleccion");
            System.out.println("3 para el mertodo de burbuja");
            System.out.println("4 para el mertodo de mergesort");
            marilu= ingreso.nextInt();
            switch(marilu){
                case 1:
                    startTime = System.nanoTime();
                    for(int x=1; x<b; x++){
                        mar=cri[x];
                        sofia=x-1;
                        while((sofia>=0)&&(cri[sofia]>mar)){
                            cri[sofia+1]=cri[sofia--];
                        }
                        cri[sofia+1]=mar;
                    }
                    System.out.println( (System.nanoTime() - startTime) + " nanoseg");
                    if(b==100){
                    esmeralda[0][0] = System.nanoTime() - startTime;
                    }
                    if(b==500){
                    esmeralda[0][1] = System.nanoTime() - startTime;
                    }
                    if(b==1000){
                    esmeralda[0][2] = System.nanoTime() - startTime;
                    }
                    if(b==5000){
                    esmeralda[0][3] = System.nanoTime() - startTime;
                    }
                    if(b==10000){
                    esmeralda[0][4] = System.nanoTime() - startTime;
                    }
                break;
                case 2:
                    startTime = System.nanoTime();
                    for(int x=0; x<b-1; x++){
                        luz=cri[x];
                        sofia=x;
                        for(ema=x+1; ema<b; ema++){
                            if(cri[ema]<luz){
                                luz=cri[ema];
                                sofia=ema;
                            }
                        }
                        if(luz!=x){
                            mar=cri[x];
                            cri[x]=cri[sofia];
                            cri[sofia]=mar;
                        }
                    }
                    System.out.println( ( System.nanoTime() - startTime) + " nanoseg");
                    if(b==100){
                    esmeralda[1][0] = System.nanoTime() - startTime;
                    }
                    if(b==500){
                    esmeralda[1][1] = System.nanoTime() - startTime;
                    }
                    if(b==1000){
                    esmeralda[1][2] = System.nanoTime() - startTime;
                    }
                    if(b==5000){
                    esmeralda[1][3] = System.nanoTime() - startTime;
                    }
                    if(b==10000){
                    esmeralda[1][4] = System.nanoTime() - startTime;
                    }
                break;
                case 3:
                    startTime = System.nanoTime();
                    for(int x=0; x<b; x++){
                        for(int y=0; y<b-1; y++){
                            double act=cri[y], sig=cri[y+1];
                            if(act>sig){
                                cri[y]=sig;
                                cri[y+1]=act;
                            }
                        }
                    }
                    System.out.println( ( System.nanoTime() - startTime) + " nanoseg");
                    if(b==100){
                    esmeralda[2][0] = System.nanoTime() - startTime;
                    }
                    if(b==500){
                    esmeralda[2][1] = System.nanoTime() - startTime;
                    }
                    if(b==1000){
                    esmeralda[2][2] = System.nanoTime() - startTime;
                    }
                    if(b==5000){
                    esmeralda[2][3] = System.nanoTime() - startTime;
                    }
                    if(b==10000){
                    esmeralda[2][4] = System.nanoTime() - startTime;
                    }
                break;
                case 4:
                    a=b/2;
                    startTime = System.nanoTime();
                    for (int x=0; x<a; x++){
                        liz[x]=cri[x];
                    }
                    for (int x=0; x<a; x++){
                        sam[x]=cri[x+a];
                    }
                    for(int x=0; x<a; x++){
                        for(int y=0; y<a-1; y++){
                            double act=liz[y], sig=liz[y+1];
                            if(act>sig){
                                liz[y]=sig;
                                liz[y+1]=act;
                            }
                        }
                    }
                    for(int x=0; x<a; x++){
                        for(int y=0; y<a-1; y++){
                            double act=sam[y], sig=sam[y+1];
                            if(act>sig){
                                sam[y]=sig;
                                sam[y+1]=act;
                            }
                        }
                    }
                    la=0;
                    ema=0;
                    sofia=0;
                    while(ema<=a && sofia<a){
                        if(liz[ema]<=sam[sofia]){
                            cri[la]=liz[ema];
                            ema++;
                        } 
                        if(sam[sofia]<liz[ema]){
                            cri[la]=sam[sofia];
                            sofia++;
                        }
                        la++;
                    }
                    while(ema<=a){
                        cri[la]=liz[ema];
                        ema++;
                        la++;
                    }
                    while(sofia<a){
                        cri[la]=sam[sofia];
                        sofia++;
                        la++;
                    }
                    System.out.println( (System.nanoTime() - startTime) + " nanoseg");
                    if(b==100){
                    esmeralda[3][0] = System.nanoTime() - startTime;
                    }
                    if(b==500){
                    esmeralda[3][1] = System.nanoTime() - startTime;
                    }
                    if(b==1000){
                    esmeralda[3][2] = System.nanoTime() - startTime;
                    }
                    if(b==5000){
                    esmeralda[3][3] = System.nanoTime() - startTime;
                    }
                    if(b==10000){
                    esmeralda[3][4] = System.nanoTime() - startTime;
                    }
                break;
            }
            masi++;
            }while(masi<20);
            System.out.println("tamaño      |   100   |   500     |   1000       |   5000       |   10000   |");
            System.out.println("insercion   |   "+esmeralda[0][0]+" |   "+esmeralda[0][1]+" |   "+esmeralda[0][2]+" |   "+esmeralda[0][3]+"  |   "+esmeralda[0][4]);
            System.out.println("seleccion   |   "+esmeralda[1][0]+" |   "+esmeralda[1][1]+" |   "+esmeralda[1][2]+" |   "+esmeralda[1][3]+" |   "+esmeralda[1][4]);
            System.out.println("burbuja     |   "+esmeralda[2][0]+" |   "+esmeralda[2][1]+" |   "+esmeralda[2][2]+" |   "+esmeralda[2][3]+" |   "+esmeralda[2][4]);
            System.out.println("mergesort   |   "+esmeralda[3][0]+" |   "+esmeralda[3][1]+" |   "+esmeralda[3][2]+" |   "+esmeralda[3][3]+" |   "+esmeralda[3][4]);
        }   
        if(la==3){
            System.out.println("nada XD");
        }
    }
}
