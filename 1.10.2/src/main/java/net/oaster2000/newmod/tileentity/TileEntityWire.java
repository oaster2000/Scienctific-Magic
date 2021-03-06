package net.oaster2000.newmod.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.oaster2000.newmod.energy.EnergyStorageMod;

public class TileEntityWire extends TileEntity implements ITickable {
	
	EnergyStorageMod storage = new EnergyStorageMod(100);

	public EnergyStorageMod getStorage() {
		return storage;
	}

	public void isNeighborGen(World world, int x, int y, int z) {
		if (world.getTileEntity(new BlockPos(x + 1, y, z)) instanceof TileEntityGenerator) {
			TileEntityGenerator tileentity = (TileEntityGenerator) world.getTileEntity(new BlockPos(x + 1, y, z));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
		if (world.getTileEntity(new BlockPos(x - 1, y, z)) instanceof TileEntityGenerator) {
			TileEntityGenerator tileentity = (TileEntityGenerator) world.getTileEntity(new BlockPos(x - 1, y, z));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
		if (world.getTileEntity(new BlockPos(x, y + 1, z)) instanceof TileEntityGenerator) {
			TileEntityGenerator tileentity = (TileEntityGenerator) world.getTileEntity(new BlockPos(x, y + 1, z));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
		if (world.getTileEntity(new BlockPos(x, y - 1, z)) instanceof TileEntityGenerator) {
			TileEntityGenerator tileentity = (TileEntityGenerator) world.getTileEntity(new BlockPos(x, y - 1, z));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
		if (world.getTileEntity(new BlockPos(x, y, z + 1)) instanceof TileEntityGenerator) {
			TileEntityGenerator tileentity = (TileEntityGenerator) world.getTileEntity(new BlockPos(x, y, z + 1));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
		if (world.getTileEntity(new BlockPos(x, y, z - 1)) instanceof TileEntityGenerator) {
			TileEntityGenerator tileentity = (TileEntityGenerator) world.getTileEntity(new BlockPos(x, y, z - 1));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
	}
	
	public void isNeighborSolar(World world, int x, int y, int z) {
		if (world.getTileEntity(new BlockPos(x + 1, y, z)) instanceof TileEntitySolarGenerator) {
			TileEntitySolarGenerator tileentity = (TileEntitySolarGenerator) world.getTileEntity(new BlockPos(x + 1, y, z));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
		if (world.getTileEntity(new BlockPos(x - 1, y, z)) instanceof TileEntitySolarGenerator) {
			TileEntitySolarGenerator tileentity = (TileEntitySolarGenerator) world.getTileEntity(new BlockPos(x - 1, y, z));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
		if (world.getTileEntity(new BlockPos(x, y + 1, z)) instanceof TileEntitySolarGenerator) {
			TileEntitySolarGenerator tileentity = (TileEntitySolarGenerator) world.getTileEntity(new BlockPos(x, y + 1, z));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
		if (world.getTileEntity(new BlockPos(x, y - 1, z)) instanceof TileEntitySolarGenerator) {
			TileEntitySolarGenerator tileentity = (TileEntitySolarGenerator) world.getTileEntity(new BlockPos(x, y - 1, z));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
		if (world.getTileEntity(new BlockPos(x, y, z + 1)) instanceof TileEntitySolarGenerator) {
			TileEntitySolarGenerator tileentity = (TileEntitySolarGenerator) world.getTileEntity(new BlockPos(x, y, z + 1));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
		if (world.getTileEntity(new BlockPos(x, y, z - 1)) instanceof TileEntitySolarGenerator) {
			TileEntitySolarGenerator tileentity = (TileEntitySolarGenerator) world.getTileEntity(new BlockPos(x, y, z - 1));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
	}

	public void isNeighborWire(World world, int x, int y, int z) {
		if (world.getTileEntity(new BlockPos(x + 1, y, z)) instanceof TileEntityWire) {
			TileEntityWire tileentity = (TileEntityWire) world.getTileEntity(new BlockPos(x + 1, y, z));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
		if (world.getTileEntity(new BlockPos(x - 1, y, z)) instanceof TileEntityWire) {
			TileEntityWire tileentity = (TileEntityWire) world.getTileEntity(new BlockPos(x - 1, y, z));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
		if (world.getTileEntity(new BlockPos(x, y + 1, z)) instanceof TileEntityWire) {
			TileEntityWire tileentity = (TileEntityWire) world.getTileEntity(new BlockPos(x, y + 1, z));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
		if (world.getTileEntity(new BlockPos(x, y - 1, z)) instanceof TileEntityWire) {
			TileEntityWire tileentity = (TileEntityWire) world.getTileEntity(new BlockPos(x, y - 1, z));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
		if (world.getTileEntity(new BlockPos(x, y, z + 1)) instanceof TileEntityWire) {
			TileEntityWire tileentity = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z + 1));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
		if (world.getTileEntity(new BlockPos(x, y, z - 1)) instanceof TileEntityWire) {
			TileEntityWire tileentity = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z - 1));
			TileEntityWire tileentityWire = (TileEntityWire) world.getTileEntity(new BlockPos(x, y, z));
			if (tileentity.getStorage().getEnergyStored() > 0 && tileentityWire.getStorage().getEnergyStored() < tileentityWire.getStorage().getMaxEnergyStored()) {
				tileentity.getStorage().extractEnergy(1, false);
				tileentityWire.getStorage().receiveEnergy(1, false);
			}
		}
	}

	public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);
        pos = new BlockPos(compound.getInteger("x"), compound.getInteger("y"),compound.getInteger("z"));
    }

    public NBTTagCompound writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);
        compound.setInteger("x", pos.getX());
        compound.setInteger("y", pos.getY());
        compound.setInteger("z", pos.getZ());

        return compound;
    }
	
	public void update() {

		
		if (!worldObj.isRemote) {
			isNeighborGen(worldObj, pos.getX(), pos.getY(), pos.getZ());
			isNeighborSolar(worldObj, pos.getX(), pos.getY(), pos.getZ());
			isNeighborWire(worldObj, pos.getX(), pos.getY(), pos.getZ());
		}
	}
	
	public NBTTagCompound getUpdateTag()
    {
        return this.writeToNBT(new NBTTagCompound());
    }
	
	public void handleUpdateTag(NBTTagCompound tag)
    {
        this.readFromNBT(tag);
    }

}
