package net.mcreator.supermario.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BlueOutlineBlockUpdateTickProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z
) {
if (==true&&==false) {{
BlockPos _bp = new BlockPos(x,y,z);
BlockState _bs = SuperMarioModBlocks.BLUE_FILLED_BLOCK.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
world.setBlock(_bp, _bs, 3);
}
}
}
}
