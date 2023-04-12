public class Atom
{
    private int protons;
    private int neutrons;
    private int electrons;
    
    public int getProtons()
    {
        return this.protons;
    }
    
    public int getNeutrons()
    {
        return this.neutrons;
    }
    
    public int getElectrons()
    {
        return this.electrons;
    }
    
    public boolean setProtons(int protons)
    {
        boolean flag = false;
        
        if(protons>0)
        {
            this.protons = protons;
            flag = true;
        }    
            return flag;
    }
    
    public boolean setNeutrons(int neutron)
    {
        boolean flag = false;
        
        if(neutrons>=0)
        {
            this.neutrons = neutrons;
            flag = true;
        }    
            return flag;
    }
    
    public boolean setElectrons(int electrons)
    {
        boolean flag = false;
        
        if(electrons>0)
        {
            this.electrons = electrons;
            flag = true;
        }   
            return flag;
    }
    
    public Atom()
    {
        this.protons = 1;
        this.neutrons = 0;
        this.electrons = 1;
    }
    
    public boolean isIon()
    {
        if(this.electron != this.protons)
            return true;
        else
            return false;
    }
    
    public int getAtomicMassNumber()
    {
        return this.protons + this.neutrons;
    }
    
}