package mod.reborn.server.entity.dinosaur;

import mod.reborn.client.model.animation.EntityAnimation;
import mod.reborn.client.sound.SoundHandler;
import mod.reborn.server.entity.DinosaurEntity;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class MicroceratusEntity extends DinosaurEntity
{
    public MicroceratusEntity(World world)
    {
        super(world);
    }
    @Override
    public SoundEvent getSoundForAnimation(Animation animation)
    {
        switch (EntityAnimation.getAnimation(animation))
        {
            case SPEAK:
                return SoundHandler.MICROCERATUS_LIVING;
            case DYING:
                return SoundHandler.MICROCERATUS_DEATH;
            case INJURED:
                return SoundHandler.MICROCERATUS_HURT;
            case BEGGING:
                return SoundHandler.MICROCERATUS_THREAT;
        }

        return null;
    }
}
