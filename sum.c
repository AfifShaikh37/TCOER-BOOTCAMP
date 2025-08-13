#include <stdio.h>
void sum(int a,int b){
  int c=a+b;
  printf(" addition of %d and %d number = %d",a,b,c);
}
int main() {
    int a;
    int b;
    printf("enter your first number :\n");
    scanf("%d",&a);
    printf("enter your second number :\n");
    scanf("%d",&b);
    sum(a,b);
    return 0;
    }