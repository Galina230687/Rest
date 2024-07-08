package ru.netology.rest2.exeption;

public class UnauthorizedUser extends RuntimeException
{
    public UnauthorizedUser(String msg)
    {
        super(msg);
    }
}
