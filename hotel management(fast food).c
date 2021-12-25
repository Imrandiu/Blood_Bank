#include <stdio.h>

void user_panel()
{
    printf( "USER PANEL" );
}


void admin_panel()
{
   printf("                         Welcome to ADMIN PANEL\n\n Please Enter Password  = >>   " );
	char pass[5] = "11111";
	char user[9];
	scanf("  %[^\n]%*c", user);
	if (strcmp(pass, user)==0) {
		printf("Loged In as Admin\n\n");
		return 0;
	}else{
		printf("Sorry Wrong Password\n\n" );
		return 1;
	}
}


void about_us()
{
    printf( "nafeez hossain , arjun baidya, jebin nessa" );
}

int main()
{
    int input;
    printf( "                         \n\n\n\n\n" );


    printf( "                   WELCOME   TO   OUR  RESTUARANT\n\n\n\n" );

    printf( "                             1. USER PANEL\n\n" );
    printf( "                             2. ADMIN PANEL\n\n" );
    printf( "                             3. ABOUT US\n\n" );
    printf( "                             4. Exit\n\n" );
    printf( "\n\n\n\n\n\n\n SELECT your option :   " );
    scanf( "%d", &input );
    switch ( input ) {
        case 1:            /* Note the colon, not a semicolon */
           user_panel();
            break;

        case 2:
            admin_panel();
            break;
        case 3:
            about_us();
             printf( "nafeez hossain , arjun baidya, jebin nessa" );
            break;
        case 4:
            printf( "Thanks for your kind selection\n\n" );
            break;
        default:
            printf( " PLEASE SELECT A CORRECT OPTION !!, quitting!\n" );
            break;
    }
    getchar();



    int option,size,number;
    while(1)
    {
       system("cls");
       printf("\t***  Welcome to Friends Fast food***\n\n\n\n");
    printf("please, select food number to order\n\n\n\n1.Beef Burger\n\n2.Chicken Burger\n\n3.pizza\n\n4.Fried chicken\n\n5.Sandwich\n\n");
    printf("6.chicken Role\n\n7.vegetable Role\n\n");
    scanf("%d",&option);
    if(option==1)
    {
        system("cls");
        printf("select size\n\n1.single  - 30 tk\n\n2.double  - 50 tk\n\n");
        scanf("%d",&size);
        if(size==1)
        {
            system("cls");
            printf("number of order:");
            scanf("%d",&number);
            if(number!=0)
            {
                system("cls");
                printf("\n\nyou ordered %d piece single Beef burger. \n\nplease wait , it may takes sometimes \n\n",number);
            }
        }
        else if(size==2)
        {
            system("cls");
            printf("number of order:");
            scanf("%d",&number);
            if(number!=0)
            {
                system("cls");
                printf("\nyou ordered %d piece double Beef burger. \n\nplease wait for some time\n",number);
            }
        }
    }
    else if(option==2)
    {
        system("cls");
        printf("select size\n1.single  - 50 tk\n\n2.double  - 80 tk\n\n");
        scanf("%d",&size);
        if(size==1)
        {
            system("cls");
            printf("number of order:");
            scanf("%d",&number);
            if(number!=0)
            {
                system("cls");
                printf("\nyou ordered %d piece single Chicken Burger. \n\nplease wait for sometimes \n",number);
            }
        }
        else if(size==2)
        {
            system("cls");
            printf("number of order:");
            scanf("%d",&number);
            if(number!=0)
            {
                system("cls");
                printf("\nyou ordered %d piece double Chicken Burger. \n\nplease wait for some time\n",number);
            }
        }
    }
    else if(option==3)
    {
        system("cls");
        printf("select size\n1.single  - 130 tk\n\n2.double  - 250 tk\n\n");
        scanf("%d",&size);
        if(size==1)
        {
            system("cls");
            printf("number of order:");
            scanf("%d",&number);
            if(number!=0)
            {
                system("cls");
                printf("\nyou ordered %d piece single Pizza. \n\nplease wait for sometimes \n",number);
            }
        }
        else if(size==2)
        {
            system("cls");
            printf("number of order:");
            scanf("%d",&number);
            if(number!=0)
            {
                system("cls");
                printf("\nyou ordered %d piece double Pizza. \n\nplease wait for some time\n",number);
            }
        }
    }
    else if(option==4)
    {
         system("cls");
        printf("select size\n1.single  - 120 tk\n\n2.double  - 250 tk\n\n");
        scanf("%d",&size);
        if(size==1)
        {
            system("cls");
            printf("number of order:");
            scanf("%d",&number);
            if(number!=0)
            {
                system("cls");
                printf("\nyou ordered %d piece single Fried Chicken. \n\nplease wait for sometimes \n",number);
            }
        }
        else if(size==2)
        {
            system("cls");
            printf("number of order:");
            scanf("%d",&number);
            if(number!=0)
            {
                system("cls");
                printf("\nyou ordered %d piece double Fried Chicken. \n\nplease wait for some time\n",number);
            }
        }
    }
    else if(option==5)
    {
          system("cls");
        printf("select size\n1.single  - 40 tk\n\n2.double  - 70 tk\n\n");
        scanf("%d",&size);
        if(size==1)
        {
            system("cls");
            printf("number of order:");
            scanf("%d",&number);
            if(number!=0)
            {
                system("cls");
                printf("\nyou ordered %d piece single Sandwich. \n\nplease wait for sometimes \n",number);
            }
        }
        else if(size==2)
        {
            system("cls");
            printf("number of order:");
            scanf("%d",&number);
            if(number!=0)
            {
                system("cls");
                printf("\nyou ordered %d piece double Sandwich. \n\nplease wait for some time\n",number);
            }
        }
    }
    else if(option==6)
    {
          system("cls");
        printf("select size\n1.single  - 35 tk\n\n2.double  - 60 tk\n\n");
        scanf("%d",&size);
        if(size==1)
        {
            system("cls");
            printf("number of order:");
            scanf("%d",&number);
            if(number!=0)
            {
                system("cls");
                printf("\nyou ordered %d piece single Chicken Role. \n\nplease wait for sometimes \n",number);
            }
        }
        else if(size==2)
        {
            system("cls");
            printf("number of order:");
            scanf("%d",&number);
            if(number!=0)
            {
                system("cls");
                printf("\nyou ordered %d piece double Chicken Role. \n\nplease wait for some time\n",number);
            }
        }
    }
    else if(option==7)
    {
           system("cls");
        printf("select size\n1.single  - 20 tk\n\n2.double  - 35 tk\n\n");
        scanf("%d",&size);
        if(size==1)
        {
            system("cls");
            printf("number of order:");
            scanf("%d",&number);
            if(number!=0)
            {
                system("cls");
                printf("\nyou ordered %d piece single Vegetable Role. \n\nplease wait for sometimes \n",number);
            }
        }
        else if(size==2)
        {
            system("cls");
            printf("number of order:");
            scanf("%d",&number);
            if(number!=0)
            {
                system("cls");
                printf("\nyou ordered %d piece double Vegetable Role. \n\nplease wait for some time\n",number);
            }
        }
    }
    else
    {
        printf("invalid option\n");
    }
    printf("and press any key to order any other item again\n");
    getch();
    }
    return 0;
}
