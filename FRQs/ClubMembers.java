package FRQs;
public class ClubMembers
{
    public void addMembers(String [] names, int gradYear)
    {
        for(String name : names)
        {
            memberList.add(new MemberInfo(name, gradYear, true));
        }
    }

    public ArrayList<MemeberInfo> removeMembers(int year)
    {
        int i = 0;
        while(i < memberList.size() )
        {
            if(memberList.get(i).getGradYear() <= year)
            {
                MemberInfo removed = memberList.remove(i);
                if(removed.inGoodStanding())
                goodStanding.add(removed);
            }
            else 
            i++;
        }
        return goodStanding;
    }
}