package Account.View;
import Account.Controller.Account_Controller;
import Account.Entity.Account;
import Account.Entity.ListAccount;


public class AppRun {
	
	public static void PrintDisplay(int[] arrList) {
		for(int i=0;i<arrList.length;i++) {
			if(arrList[i]!=0) {
				System.out.println(arrList[i]);
			}
		}
	}
		
		public static void main(String[] args) {
			//Tao ra cac field acc chua value tung acc mot.
			
			Account acc1 = new Account(1, "A", 50);
			Account acc2 = new Account(2, "B", 40);
			Account acc3 = new Account(3, "c", 10);
			Account acc4 = new Account(4, "D", 60);
			Account acc5 = new Account(5, "E", 80);
			Account acc6 = new Account(6, "F", 20);
			Account acc7 = new Account(7, "G", 50);
			Account acc8 = new Account(8, "H", 10);
			Account acc9 = new Account(9, "J", 90);
			Account acc10 = new Account(10, "J", 90);
			
			//Add cac fied acc vao mang listAcc;
			Account[] Acc = new Account[10];
			Acc[0]=acc1;
			Acc[1]=acc2;
			Acc[2]=acc3;
			Acc[3]=acc4;
			Acc[4]=acc5;
			Acc[5]=acc6;
			Acc[6]=acc7;
			Acc[7]=acc8;
			Acc[8]=acc9;
			Acc[9]=acc10;
			//Do output array[] thi input phai array[].
			ListAccount listAcc = new ListAccount();
			listAcc.setArrAccount(Acc);
			
			//Xu ly tim ra diem thap nhat hoac cao nhat.
			Account_Controller accController = new Account_Controller();
			listAcc.setChoice(1);
			int result[] = accController.ChoiceMaxOrMin(listAcc,listAcc.getChoice());
			PrintDisplay(result);
			
		}
	}
