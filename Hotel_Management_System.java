package HRB;
import java.io.*;
import java.util.*;

public class Hotel_Management_System{
    public static void main(String[] args) {
        try{
            File f = new File("backup.txt");
            if(f.exists())
            {
                FileInputStream fin=new FileInputStream(f);
                ObjectInputStream ois=new ObjectInputStream(fin);
                Hotel.ob=(holder)ois.readObject();
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Heyy!!Welcome to our Hotel.");
            int ch,ch2,ch1, rn;
            char wish;
            x:
            do{ System.out.println("\nEnter appropriate option to enjoy our services\n1.Customer\n2.Admin\n3.Exit");
            	ch1 = sc.nextInt();
            	switch(ch1) {
            	case 1:
                System.out.println("Heyy!!Customer.");
                System.out.println("\nEnter your choice :\n1.Display room details\n2.Display room availability \n3.Book\n4.Order food\n5.Exit\n");
                ch = sc.nextInt();
                switch (ch){
                    case 1: System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room \n4.Deluxe Single Room\n");
                            ch2 = sc.nextInt();
                            Hotel.features(ch2);
                            break;

                    case 2: System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
                            ch2 = sc.nextInt();
                            Hotel.availability(ch2);
                            break;

                    case 3: System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
                            ch2 = sc.nextInt();
                            Hotel.bookroom(ch2);
                            break;

                    case 4: System.out.println("Room Number: ");
                            rn = sc.nextInt();
                            if(rn > 60)
                                System.out.println("Room doesn't exist");
                            else if(rn > 40)
                                Hotel.order(rn - 41, 4);
                            else if(rn > 30)
                                Hotel.order(rn - 31, 3);
                            else if(rn > 10)
                                Hotel.order(rn - 11, 2);
                            else if(rn>0)
                                Hotel.order(rn - 1,1);
                            else
                                System.out.println("Room doesn't exist");
                            break;
          	
                    case 5: break x;
                }
                break;
            	case 2:
            		System.out.println("Heyy!!Admin.");
            		 int p;
                     System.out.println("Hey Admin!please enter your password :)");
                     p=sc.nextInt();
                     if(p==6789) {
            		System.out.println("\nEnter your choice :\n1.Display Booked rooms\n2.Cancel room\n3.checkout\n4.Exit\n");
                    ch = sc.nextInt();
                    switch (ch){
                    case 1:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
                    ch2 = sc.nextInt();
                    Hotel.occupied(ch2);
                    break;
                    case 2: System.out.println("Room Number: ");
                    rn = sc.nextInt();
                    if(rn > 60)
                        System.out.println("Room doesn't exist");
                    else if(rn > 40)
                        Hotel.cancel(rn - 41, 4);
                    else if(rn > 30)
                        Hotel.cancel(rn - 31, 3);
                    else if(rn > 10)
                        Hotel.cancel(rn - 11, 2);
                    else if(rn>0)
                        Hotel.cancel(rn - 1,1);
                    else
                        System.out.println("Room doesn't exist");
                         break;
                    case 3:System.out.println("Room Number: ");
                    rn = sc.nextInt();
                    if(rn > 60)
                        System.out.println("Room doesn't exist");
                    else if(rn > 40)
                        Hotel.deallocate(rn - 41, 4);
                    else if(rn > 30)
                        Hotel.deallocate(rn - 31, 3);
                    else if(rn > 10)
                        Hotel.deallocate(rn - 11, 2);
                    else if(rn>0)
                        Hotel.deallocate(rn - 1,1);
                    else
                        System.out.println("Room doesn't exist");
                    break;
                    case 4: break ;
                    }
                    }
                     
                     else {
                     	System.out.println("Kindly contact your admin to Cancel your room");
                     	
                     }
                     break ;
            	case 3:
            		break x;}
            		
                System.out.println("\nContinue : (y/n)");
                wish=sc.next().charAt(0);
                if(!(wish=='y'||wish=='Y'||wish=='n'||wish=='N'))
                {
                    System.out.println("Invalid Option");
                    System.out.println("\nContinue : (y/n)");
                    wish=sc.next().charAt(0);
                }

            }while(wish=='y'||wish=='Y');
            new FileOutputStream("backup.txt").close();
            Thread t=new Thread(new write(Hotel.ob));
            t.start();
        }
        catch (Exception e){
            System.out.println("Not a valid input");
        }
        finally {
            System.out.println("Thank You for visiting us! :) :) ");
        }
    }
}