
#include <stdio.h>
#include <string.h>

static int items = 100;
static int customer = 0;

int main()
{
	printf("		Welcome to Reem's Resturant\n		========================\n\n	Please Log in as Admin to create the menu\n			1. Admin\n			2. Customer\n=>");
	int fast;
	while(scanf(" %d", &fast)==1 && fast !=1){
		printf("The menu has not been made..Please Log in as Admin\n");
	}

	while (checkPass() != 0) {
		printf("Sorry Can Only be start by the Admin.. Try again \n");
	}

	printf("How many food items in the menu?\n=> ");
	scanf("%d", &items);

	char foodName[items+10][30];
	char foodSize[items+10];
	int foodQuantity[items+10];
	int foodVisible[items+10];
	int i;
	for ( i = 0; i < items; ++i)
	{
		printf("Item Number %d\n========\nFood Name?\n=>", i+1);
		scanf("  %[^\n]%*c", &foodName[i]);
		printf("Food Size?\n=>");
		scanf("  %c", &foodSize[i]);
		printf("How many of %s do we have?\n=>", foodName[i]);
		scanf("%d", &foodQuantity[i]);
		foodVisible[i] = 1;
	}


	ask();
	int question;
	while (scanf("%d", &question) == 1) {
		switch (question) {
			case 1:
			{
				if (checkPass()==0) {
					int questionAdmin;
					printMenu(foodName, foodSize, foodQuantity, foodVisible,items);
					askAdmin();
					int br = 1;
					while(scanf("%d", &questionAdmin) == 1 && br == 1 ){
						switch (questionAdmin) {
							case 1:
								updateMenu(foodName, foodSize, foodQuantity, foodVisible, items);
								break;
							case 2:
								{
									printf("Item Number %d\n========\nFood Name?\n=>", items+1);
									scanf("  %[^\n]%*c", &foodName[items]);
									printf("Food Size?\n=>");
									scanf("  %c", &foodSize[items]);
									printf("How many of %s do we have?\n=>", foodName[items]);
									scanf("%d", &foodQuantity[items]);
									foodVisible[items] = 1;
									items++;
								}
								break;
							case 3:
								deleteItem(foodVisible);
								break;
							case 4:
								currentStatus();
								break;
							case 5:
								br == 0;
								break;
							default:
								printf("Soory wrong input\n" );
								break;
						}
						askAdmin();
					}

					}else{
						printf("Soory You are Logged out\n");
					}

			}
				break;
			case 2:
			{
				printf("Welcome Customer\n=================\n\n Select the one you want to buy form our Menu\n\n" );
				printMenu(foodName, foodSize, foodQuantity, foodVisible,items);

				char customerFoodName[items][30];
				char customerFoodSize[items];
				int customerFoodQuantity[items];
				int customerFoodVisible[items];
				int customerMenu[items];
				int customerItem = 0;
				char more = 'y';
				while (more =='y') {
					int n, q;
					printf("Which item you want to buy?\n=>" );
					scanf("%d", &n); n--;
					n = realItem(foodVisible, items, n);
					if (foodQuantity[n] == 0) {
						printf("Sorry we don't have this Food");
						continue;
					}
					printf("How much you want to buy?\n=>");
					scanf("%d", &q);
					if (foodQuantity[n]<q) {
						printf("Sorry we don't have this much food. Please Select the item again.\n" );
						continue;
					}
					strcpy(customerFoodName[customerItem], foodName[n]);
					customerFoodSize[customerItem] = foodSize[n];
					customerFoodQuantity[customerItem] = q;
					customerFoodVisible[customerItem] = 1;
					customerMenu[customerItem] = n;
					customerItem++;
					printf("Do you want to anything else? (if yes press 'y' or press 'n')\n=>" );
					scanf(" %c", &more);
				}
				int br = 0;
				while(br == 0){
					printf("This is your Food items\n" );
					printMenu(customerFoodName, customerFoodSize, customerFoodQuantity, customerFoodVisible,customerItem);
					printf("\nPlease Select what do want to do\n===========================\n   1. Confirm this order\n    2. Change any Food\n    3. Delete a Food in this order\n    4. Cancel this order\n=>" );
					int depart;
					scanf("%d", &depart);
					switch (depart) {
						case 2: ;
							int n, r,q;
							printf("Which item you want to change?\n=>" );
							scanf("%d", &r);r--;
							r = realItem(customerFoodVisible, customerItem, r);
							printf("With which item on the menu?\n");
							while(scanf("%d", &n)==1){
								n--;
								n = realItem(foodVisible, items, n);
								if (foodQuantity[n] == 0) {
									printf("Sorry we don't have this Food");
									continue;
								}else{
									break;
								}
							}
							printf("How much you want to buy?\n=>");
							while (scanf("%d", &q) == 1) {
								if (foodQuantity[n]<q) {
									printf("Sorry we don't have this much food. Please reduce the Quantity again.\n" );
									continue;
								}else{
									break;
								}
							}
							strcpy(customerFoodName[r], foodName[n]);
							customerFoodSize[r] = foodSize[n];
							customerFoodQuantity[r] = q;
							customerFoodVisible[r] = 1;
							customerMenu[r] = n;
							break;
						case 1:
							done(foodQuantity, customerFoodQuantity, customerFoodVisible, customerMenu, customerItem);
							printf("Your order is done..\nThank you for the purchase..Please Come again \n" );
							br = 1;
							break;
						case 3:
							deleteItem(customerFoodVisible);
							break;
						case 4:
							printf("Soory for disturbing you..\n" );
							br=1;
							break;
						default:
							printf("Wrong input\n" );
							break;
					}
				}
			}
				break;
			default:
				printf("Sorry Wrong Input\n");
				break;

		}
		ask();
	}

	return 0;
}
void printMenu(char foodName[100][30], char foodSize[], int foodQuantity[],int foodVisible[],int items) {
	int i = 0, j = 0;
   printf("#    Name   -   Size   -   Quantity\n==========================\n");
   for(;i<items;i++){
        if(foodVisible[i] == 1){
            j++;
            printf("%d .  %s     -     %c     -     %d\n", j, foodName[i], foodSize[i], foodQuantity[i]);
        }
   }
}

void updateMenu(char foodName[100][30], char foodSize[], int foodQuantity[], int foodVisible[],int items) {
	int itemNumber,changedQuantity;
	char changedName[30], changedSize;
	printf("Which Food Item number we want to change\n=>");
	scanf("%d", &itemNumber);
	itemNumber--;
	if (foodVisible[itemNumber] == 0) {
		int i = itemNumber+1;
		for (;i<items;i++) {
			if (foodVisible[i]==1) {
				itemNumber = i;
				break;
			}
		}
	}
	printf("New Food Name\n=>");
	scanf("  %[^\n]%*c", changedName);
	strcpy(foodName[itemNumber], changedName);
	printf("New Food Size\n=>");
	scanf("  %c",  &changedSize);
	foodSize[itemNumber] = changedSize;
	printf("New Food Quantity\n=>");
	scanf("%d", &changedQuantity);
	foodQuantity[itemNumber] = changedQuantity;
}

void deleteItem(int foodVisible[]) {
	int itemNumber;
	printf("Which Food Item number we want to delete\n=>" );
	scanf("%d", &itemNumber);
	itemNumber--;
	foodVisible[itemNumber] = 0;
	printf("Item Deteted\n");
}

void askCustomer() {
	printf("		Welcome to Reem's Resturant\n		=========================\n		Select what do you want to do..\n    1. Do you want to buy food?\n\n=>" );
}

void ask(){
	printf("		Welcome to Reem's Resturant\n		=========================\n		Log in as ..\n			1. Admin?\n			2. New Customer\n\n=>" );
}

void askAdmin() {
	printf("		Select what do you want to do..\n			1. Update Menu Item\n\t		2. Add Food Item.\n			3. Delete Menu Item\n			4. Check Current Status\n			5. Log Out.\n\n=>" );
}

void currentStatus(){
	printf("This is our current Status\n======================\n Customer served = > %d\n", customer);
	}

int checkPass(){
	printf("Welcome Menager\n===============\n\nPlease Enter Password => " );
	static const char pass[9] = "reemsCafe";
	char user[9];
	scanf("  %[^\n]%*c", user);
	if (strcmp(pass, user)==0) {
		printf("Loged In as Admin\n");
		return 0;
	}else{
		printf("Sorry Wrong Password\n" );
		return 1;
	}
}

int realItem(int foodVisible[], int item, int n){
	if (foodVisible[n] == 0) {
		int i = n+1;
		for (;i<item;i++) {
			if (foodVisible[i] == 1) {
				return i;
				break;
			}
		}
	}else{
		return n;
	}
}

void done(int foodQuantity[], int customerFoodQuantity[], int customerFoodVisible[], int customerMenu[], int customerItem) {
	int i = 0;
	for (; i < customerItem; i++) {
		if(customerFoodVisible[i] == 1){
			foodQuantity[customerMenu[i]] -=  customerFoodQuantity[i];
		}
	}
}
