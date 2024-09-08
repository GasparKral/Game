{}: type
(): clarification
-:  atribute
-*: object

# JAVA_Objets

### Dificulty {Enum}

* easy
* medium
* hard
* deadly

## Configuration

- * dificulty {Dificulty}
- Guiaded/Automate (has DungeonMaster?) {boolean}
- hasMaxTurnTime {boolean}
- maxTurnTime {Byte}

### Language {Enum}

* Spanish
* English
* French
* German
* Italian
* Portuguese

## Clien_Configuration

- * selected_lang {Language}

## Player

- name {String}
- adress {String}
- isTeamLeader {boolean}
- * playeable_characters {Array[PCharacter]}
- * selectedCharacter {PCharacter}
- * personal_configuration {Client_Configuration}

### StadisticType {Enum}
  
* Charisma
* Insight
* Intelligence
* Luck
* Speed
* Strengh
* TrapManipulation

## Stadistic

- * type {StadisticType}
- maxValue {number}
- actualValue {number}
- effectiveValue {Float} /*Revisar*/

### Orientation {Enum}

* good
* neutral
* evil

## Entitie (Abstract) implements <Subscriber>

- name {String}
- * orientation {Orientation}

### EffectType {Enum}

* fire
* cold
* lightning
* corruption
* physical
* fire_inmunity
* cold_inmunity
* lightning_inmunity
* corruption_inmunity
* physical_inmunity
* inmunity

## Effect (Abstract)

- isTemporal {boolean}
- lastFor (turns) {number}
- * type {EffectType}

## FightableEntitie (Abstract) extends Entitie

- actualLife {number}
- maxLife {number}
- lifeRecovery {Float}
- actualMana {number}
- maxMana {number}
- manaRecovery {Float}
- sanity {number}
- defense {number}
- lightningResistance {number}
- fireResistance {number}
- coldResistance {number}
- corruptionResistance {number}
- * stadistics {Array[Stadistic]}
- * rol {Rol}
- * equipment {Items}
- * effects {Array[Effect]}

## Monster (Abstract) extends FightableEntitie

- isBoss {boolean}
- dropTable {DropTable}


### Age {Enum}

* Young
* Adult
* Mature
* Old

## PCharacter extends FightableEntitie implements <Inventory,Seller,Buyer,Account>

- * age {Age}
- * legacyRelic {Relic}
- * traits {Array[Traits]}
- * race {Race}

## NonFightableNPC (Abstract) extends Entitie implements <Inventory,Interactable>

- * missions {Array[Mission]}

## Merchant extends NonFightableNPC implement <Seller,Buyer,Account>

## ScammerMerchant extends Merchant implement <Scammer>


### GameState {Enum}

* Battle
* Walking
* Interacting
* Paused
* Saving
* Loading
* Options
* GameOver

### Biome {Enum}

* TROPICAL_RAINFOREST,
* SAVANNA,
* TROPICAL_SEASONAL_FOREST,
* HOT_DESERT,
* COLD_DESERT,
* STEPPE,
* TEMPERATE_DECIDUOUS_FOREST,
* TEMPERATE_GRASSLAND,
* TEMPERATE_RAINFOREST,
* MEDITERRANEAN,
* BOREAL_FOREST,
* TUNDRA,
* POLAR_DESERT,
* ALPINE,
* FRESHWATER,
* MARINE,
* WETLAND,
* VOLCANO,
* FAIRY_FOREST,
* TIDALS_FLATS,
* PETRIFIED_FOREST,
* ICY_PLATEAU,
* FIREFLY_FOREST,
* SULFUR_SWAMP,
* EBONWOOD_GROVE,
* OAK_FOREST,
* MAPLE_FOREST,
* CEDAR_FOREST,
* JUNGLE,
* SMOKY_HIGHLANDS,
* SEQUOIA_FOREST,
* AMBER_ISLES,
* VIOLT_VALE,
* MUSHROOM_MEADOW,
* BONE_FOREST,
* SHADOW_SWAMP,
* ELDER_FOREST,
* RAVENS_FOREST,
* WISP_WOODS,

* UNKNOWN

## GameController implements<Subscribeable> 

- * actualState {GameEvent}
- * actualBiome {Biome}
- * listOfInvolvedsEntities {Entitie}

## AdventureStoreData

- * BiomesCrossed {Biome}
- * BossesDefeated {Monster}

## Team

- * teamLeader {Player}
- * listOfPlayers {Array[Player]}
- * acceptedMissions {Array[Mission]}

## Game (Singleton)

- roomID {number}
- * GAME_CONFIGURATION {Configuration}
- * Team {Team}
- * gameController {GameController}
- * adventureStoreData {AdventureStoreData}

