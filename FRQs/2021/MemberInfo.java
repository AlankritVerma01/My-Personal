package FRQs.2021;

public class MemberInfo {
    
}

a)
    public void addMembers(String[] names , int gradYear)
    {
        for(String name : names)
            memberList.add(new MemberInfo(name, gradYear, true));
        
    }

b)
    public ArrayList<MemberInfo> removeMembers(int year)
    {
        ArrayList<MemberInfo> goodStanding = new ArrayList<MemberInfo>();

        int i = 0;
        while(i < memberList.size())
        {
            if(memberList.get(i).getGradYear() <= year)
            {
                MemberInfo removed = memberList.remove(i);
                if(removed.inFoodStanding())
                goodStanding.add(removed);
            }
            else 
            i++;
        }
        return goodStanding;
    }