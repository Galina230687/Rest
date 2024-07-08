package ru.netology.rest2.exeption;

public class InvalidCredentials extends RuntimeException
{
    public InvalidCredentials(String msg)
    {
        super(msg);
    }
}
