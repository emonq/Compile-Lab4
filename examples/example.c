struct s
{
    int a;
    int b;
};

int main()
{
    printf("Hello, world!\n");
    int a = 1 + 5 * 3;
    scanf("%d", &a);
    while (a > 0)
    {
        a--;
        if (a == 1)
        {
            break;
        }
    }
    return 0;
}
