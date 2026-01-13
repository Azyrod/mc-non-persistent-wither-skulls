# Non Persistent Wither Skulls

## Rationale
This mods prevents wither skulls from accumulating in unloaded chunks and potentially fly forever.  
One of the issue is that wither skulls fly perfectly straight, they don't experience gravity. 

This means that if a Wither shoots upwards, and the skull doesn't hit anything, it will fly up eternally.  
This is usually not a concern for lag or anything, since you usually only have a couple of such skulls flying in the air, but you also don't really have a way to clean them up.  
They can also just fly almost horinzontaly, in which case they can travel thousands of blocks until they finally crash into a distant mountain or a player build.

Some players might find anoying to have random explosions or forever flying skulls around their world, when they are only meant to be temporary projectiles for a boss fight.

This mod takes care of that by simply not allowing Wither Skulls to ever be persisted, which means that the instant they reach unloaded chunks, they will be removed from the game.

## Alternative Mods

I have seen a couple other mods that try to accomplish the same thing, but they work in rather janky ways : 
- Some add a lifetime to the skulls, which does ensure they eventually die but it does prevent you to do fun stuff with them since you have a time limit before it disapear before your eyes
- Some add a max distance check, which does feel similar to what this mod does, but the distance feels kinda arbitrary, and if you are flying around in Elytra, you could see skuls disapear before they hit you

My mod ensure that as long as the skulls are "in combat" they stay alive, guarenteing that they won't unexpectedly despawn regardless of your render distance or if you are flying alongside one.  
The only thing it prevents you from doing is to keep one in stasis at your base on display, but I don't think too many players are doing that.

## Bugs

This mod is still in alpha, so there might be bugs.  
Feel free to open an issue for them and I'll do my best to fix them.

Pull requests are also welcome.
