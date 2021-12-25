#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char pass[20] = "end?";

void check(char ch[50])
{
	FILE *fp;
	char com[50];
	fp = fopen("Dic_10000.txt", "r");
	while(fscanf(fp , "%s" , com) != EOF){
		int len = strlen(com) , len2 = strlen(ch);
		if(len2 < 5 && len2 > 2 && len <= 5 && len > len2){
			if(((len / 2) + 1 > 2 && (len / 2) + 1 < 5)){
				int get = strspn(com , ch);
				if(get == len2){
					printf("%s ?\n", com);
				}
			}
		}
		else if(len2 < 3 && len2 > 0 && len <= 3 && len > len2){
			if(((len / 2) > 0 && (len / 2) < 3)){
				int get = strspn(com , ch);
				if(get == len2){
					printf("%s ?\n", com);
				}
			}
		}
		else if(len2 < 8 && len2 > 4 && len <= 9 && len > len2){
			if(((len / 2) + 3 > 4 && (len / 2) + 3 < 8)){
				int get = strspn(com , ch);
				if(get == len2){
					printf("%s ?\n", com);
				}
			}
		}
		else if(len2 < 12 && len2 > 7 && len <= 15 && len > len2){
			if(((len / 2) + 5 > 7 && (len / 2) + 5 < 12)){
				int get = strspn(com , ch);
				if(get == len2){
					printf("%s ?\n", com);
				}
			}
		}
	}
	fclose(fp);
}
void change()
{
	char *ch , *cmp;
	int temp = 1;
	ch = (char *)malloc(50 * sizeof(char));
	cmp = (char *)malloc(50 * sizeof(char));
	check:
	printf("\n\tEnter Your Current Password : ");
	scanf("%s", ch);
	if(strcmp(pass , ch) == 0){
		pass:
		puts("\n\tEnter New Password (Blank Space , Special Characters Are Not Allowed): \n\n\t");
		scanf("%s", ch);
		puts("\n\tReEnter Your Password : ");
		scanf("%s", cmp);
		if(strcmp(ch , cmp) == 0){
			puts("\n\tPassword Changed Successfully\n");
			strcpy(pass , cmp);
		}
		else{
			puts("\n\tPassword Not Matched!\n");
			goto pass;
		}
	}
	else{
		puts("\n\tWrong Password!\n");
		if(temp == 3){
            puts("\n\tOops!!\n\tYou Have Reached The Maximum Limit!!\n\tBetter Luck Next time!!\n");
		}
		temp++;
		goto check;
	}
}
int user()
{
    char *ch;
    char tr[20], dummy;
    tr[0]  = 'y';
    while(tr[0] == 'y'){
        check :
        printf("\tInput A word : ");
        ch = (char *)malloc(100 * sizeof(char));
        scanf("%c", &dummy);
        gets(ch);
        int i = 0,len = strlen(ch) , len2;
        for(i = 0; i < len; i++){
            if(ch[i] == ' '){
                puts("\n\tWord Cannot Be Space Separated!\n");
                goto check;
            }
        }
        strlwr(ch);
        dictionary(ch);
        free(ch);
        again :
        puts("\n\tWant To Try More? ( Press y For Yes ) : ");
        scanf("%s",&tr);
        len2 = strlen(tr);
        if(len2 > 1){
            puts("\n\tInput Cannot Be More Than One Character!\n");
            goto again;
        }
	}
}
int admin()
{
    int op;
    menu :
    printf("\n\tChoose Option : \n");
    printf("\t1 . Add Word\n\t2 . Delete Word\n\t3 . Change Login Password\n\t4 . Exit\n");
    scanf("%d", &op);
    switch(op){
        case 1:
            add();
            goto menu;
            break;
        case 2:
            delete_word();
            goto menu;
            break;
        case 3:
			change();
			goto menu;
			break;
		case 4:
			return;
		default:
			puts("\tWrong Input!\n");
			goto menu;
			break;

    }
}
void dictionary(char ch[50])
{
    int temp = 0;
    char *dic;
    dic = (char *)malloc(50 * sizeof(char));
    FILE *fp;
    fp = fopen("Dic_10000.txt", "r");
    if(fp == 0){
        printf("\n\tUnable To Load Dictionary\n");
    }
    while(fscanf(fp , "%s" , dic) != EOF){
        if(strcmp(ch , dic) == 0){
            printf("\n\tYou Spelled Correctly!\n");
            temp = 1;
            fclose(fp);
            free(dic);
            free(ch);
            return;
        }
    }
    if(temp == 0){
        printf("\n\tMisspelled!\n\n\tWhat Did You Mean ? \n\n");
        check(ch);
    }
    fclose(fp);
    free(dic);
    free(ch);
}
void add()
{
    char *add , test[50];
    add = (char *)malloc(50 * sizeof(char));
    FILE *fp;
    fp = fopen("Dic_10000.txt", "r");

    printf("\n\tEnter Word To Add in Dictinary : ");
    scanf("%s", add);
    strlwr(add);
    while(fscanf(fp , "%s", test) != EOF){
        if(strcmp(add , test) == 0){
            puts("\n\tWord Already In Dictionary!\n");
            return;
        }
    }
    if(fp != 0){
        fp = fopen("Dic_10000.txt", "a");
    }
    fputs("\n" , fp);
    fputs(add , fp);
    fclose(fp);
    printf("\n\tWord ^%s^ Added Successfully In Dictionary!\n", add);
}
void delete_word()
{
    FILE *fp , *tm;
    int temp = 0;
    char *delete_word , *word;
    delete_word = (char *)malloc(100 * sizeof(char));
    word = (char *)malloc(100 * sizeof(char));
    puts("\n\tEnter Word To Delete : ");
    scanf("%s", delete_word);
    strlwr(delete_word);
    fp = fopen("Dic_10000.txt", "r");
    tm = fopen("Temp.txt", "w");
    tm = fopen("Temp.txt", "r");
    tm = fopen("Temp.txt", "a");
    while(fscanf(fp , "%s", word) != EOF){
            if(strcmp(delete_word , word) == 0){
                temp = 1;
                continue;
            }

            fputs(word , tm);
            fputs("\n", tm);
    }
    fclose(fp);
    fclose(tm);
    if(temp == 0){
        puts("\n\tWord Not Found!!\n");
        return;
    }
    tm = fopen("Temp.txt", "r");
    fp = fopen("Dic_10000.txt", "w");
    fp = fopen("Dic_10000.txt", "r");
    fp = fopen("Dic_10000.txt", "a");
    while(fscanf(tm , "%s", word) != EOF){
        fputs(word , fp);
        fputs("\n", fp);
    }

    fclose(fp);
    fclose(tm);
    puts("\n\tWord Deleted Successfully!!\n");
    return;
}



int main()
{
    puts("\t\t\t__________________________________\n");
    printf("\t\t\t|  Welcome To Our Spell Checker  |\a\n\n");
    puts("\t\t\t__________________________________\n");
    while(1){
        int test_case = 0;
        puts("\t\t\t     = = Choose Option = = \n\n");
        puts("\t\t    ____________________________________________\n");
        puts("\t\t      | 1 . User Mode   ||   2 . Admin Mode |\n");
        puts("\t\t    ____________________________________________\n");
        int num , i = 0 , len = 0;
        char  pass_com[10] , dummy;
        scanf("%d", &num);
        switch(num){
            case 1:
                user();
                break;
            case 2:
                retry :
                test_case++;
                printf("\n\tEnter Password : ");
                scanf("%s",pass_com);
                len = strlen(pass_com);
                for(i = 0; i < len; i++){
                    if(pass_com[i] == ' '){
                        puts("\n\tPassWord Cannot Be Space Separated!\n");
                        if(test_case != 3) goto retry;
                        puts("\n\tSorry!\n\n\tWe Could not logged You in!\n\n\tYou Reached The Maximum Limit\n\n\tBetter Luck Next Time!\n\n");
                    }
                }
                if(strcmp(pass_com , pass) == 0){
                    admin();
                }
                else{
                    printf("\n\tWrong Password!\n");
                    if(test_case != 3) goto retry;
                    puts("\n\tSorry!\n\n\tWe Could not logged You in!\n\n\tYou Reached The Maximum Limit\n\n\tBetter Luck Next Time!\n\n");
                }
                break;
            default :
                printf("\tInvalid Input!\n");
        }
    }

    puts(pass);

    return 0;
}
