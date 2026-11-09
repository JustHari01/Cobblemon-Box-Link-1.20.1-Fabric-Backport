# Cobblemon Box Link — Fabric 1.20.1 unofficial backport

This project backports the Fabric edition of **Cobblemon Box Link** to Minecraft 1.20.1 and Cobblemon 1.5.2. It is an unofficial compatibility release and is not affiliated with or endorsed by Emperdog, the Cobblemon team, Mojang, or Microsoft.

## Features

- Use the Box Link item to open your Cobblemon PC from anywhere.
- Press the configurable **Open PC Storage** key while a Box Link is in the inventory.
- Optionally equip it in a Trinkets or Accessories slot.
- The server config can allow the keybind without requiring the item.
- Opening the PC remains blocked while the player is in a Cobblemon battle.
- The item keeps the upstream crafting recipe and is added to Tools & Utilities.

## Requirements

- Minecraft 1.20.1
- Fabric Loader
- Fabric API
- Cobblemon 1.5.2 for Minecraft 1.20.1
- Optional: Trinkets or Accessories for accessory-slot support

## Attribution and license

Original project: [Cobblemon Box Link by Emperdog](https://github.com/anabsolutesloth/cobblemonboxlink-multiloader)

The port retains the upstream project’s LGPL-2.1 license, required notices, icon, item model, and texture. Port-specific compatibility changes are by JustHari01. See `LICENSE` for the full license text.

## Build

Run `gradlew :fabric:remapJar` with Java 17.

AI assistance was used to help adapt the source for Minecraft 1.20.1 and its Fabric/Cobblemon APIs. The original icon, model, and texture are retained from the upstream project and were not AI-generated or altered.