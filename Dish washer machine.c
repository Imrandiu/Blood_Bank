#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int top=-1;
stack[100];
int main()
{
    printf("\t\t::: Dish washer machine :::\n");
    printf("Enter options: 1 for admin mode & 2 for user mode \n\n");
    printf("\n1. Admin Mode\n2. User Mode\n");
    int opt;
    scanf("%d",&opt);

    switch(opt)
    {
    case 1:
        admin();
        break;
    case 2:
        user();
        break;
    default:
        printf("Wrong choice!\n");
        break;
    }
    return 0;
}
void admin()
{
    system("cls");
    printf("\t\t::: Dish washer machine :::\n\n");
    printf("\t\t\t:::Admin Mode:::\n\n");
        printf("Enter options: \n\n");
        printf("\n1. Enter Capacity and each plate cleaning time\n2. Go to user mode\n");
        int opt,capa=0,time=0;
        system("cls");
            printf("Capacity: ");
            scanf("%d",&capa);
             printf("time: ");
            scanf("%d",&time);

            user(time);

    }
void user(int time)
{
    system("cls");
    printf("\t\t::: Dish washer machine :::\n\n");
    printf("\t\t\t:::User Mode:::\n\n");
    printf("Enter options: \n\n");
    printf("\n1. Input plate\n2. Use plate\n3. Show Stats\n");
    int opt,num,clean=0;
    scanf("%d",&opt);

    if(opt==1)
    {
        printf("Enter number of plates: \n");
            scanf("%d",&num);
            clean=clean+num;
            push(num);
        user(time);
    }
    else if(opt==2)
    {
        pop();
        user(time);
    }
    else if(opt==3)
    {

      int i;
    system("cls");
    int temp=top;
for(i=top;i>=-1;i--);
    printf("Total cleaned: %d\n",stack[top-1]);
      printf("still uncleaned in the machine: %d\n",stack[top]);
      printf("Total time needed: %d\n",stack[top-1]*time);
    }
    else{
        printf("Wrong choice!\n");
        }
}
void push(int data)
{
    stack[++top]=data;
}
void pop()
{
    top--;
}



