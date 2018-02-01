package hackerrank.validIP;

class MyRegex
{
String ip_pattern = "(([0-2][0-5][0-5])|([0-9]{1,2}))";
String pattern = ip_pattern + "." + ip_pattern +"."+ip_pattern+"."+ip_pattern;
}
