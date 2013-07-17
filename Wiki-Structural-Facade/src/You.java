/* Complex parts */
 
class CPU {
    public void freeze() { System.out.println("freeze"); }
    public void jump(long position) { System.out.println("Position: position"); }
    public void execute() { System.out.println("execute");}
}
 
class Memory {
    public void load(long position, byte[] data) { System.out.println("load"); }
}
 
class HardDrive {
    public byte[] read(long lba, int size) { System.out.println("read"); return new byte[10];}
}
 
/* Facade */
 
class Computer {
	//representativos
    private static final long BOOT_ADDRESS = 0;
	private static final long BOOT_SECTOR = 0;
	private static final int SECTOR_SIZE = 0;
	
	private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
 
    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }
 
    public void startComputer() {
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}
 
/* Client */
 
public class You {
    public static void main(String[] args) {
        Computer facade = new Computer();
        facade.startComputer();
    }
}