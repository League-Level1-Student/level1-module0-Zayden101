import javax.swing.JOptionPane;

/*
	 *    Copyright (c) The League of Amazing Programmers 2013-2019
	 *    Level 1
	 */


	public class Zchswowadv  {
		public static void main(String[] args) {
	
			
			
		String o1 = JOptionPane.showInputDialog("1: Explore   2: Get wood");

if (o1.equals("1")) {
	JOptionPane.showMessageDialog(null, "You explore a bit, and find a cave");
	String o2 = JOptionPane.showInputDialog("1: Explore cave   2: Continue exploring");
	
	if (o2.equals("2")) {
		JOptionPane.showMessageDialog(null, "You explore a bit more, come across a village");
		String o3 = JOptionPane.showInputDialog("1: Explore village   2: Continue exploring");
		
		//o3 B send back to o1
		
		if (o3.equals("1")) {
			JOptionPane.showMessageDialog(null, "You explore the village, and find a blacksmith house. In the chest, the is 8 obsidian, 2 diamonds, an iron pickaxe, and an iron chestplate");
			String o4 = JOptionPane.showInputDialog("1: Take the stuff   2: Leave it there");
			
			if (o4.equals("1")) {
				JOptionPane.showMessageDialog(null, "You take the stuff, and decide to continue exploring. You eventually come across a huge mine with many ores inside, and also many mobs inside");
				String o5 = JOptionPane.showInputDialog("1: Continue exploring   2: Explore cave");
				
				if (o5.equals("2")) {
					JOptionPane.showMessageDialog(null, "You explore the cave, you come across an ender man, and manage to obtain an ender pearl. You mine many ores with your pickaxe, while also using it to fight off mobs. Finally, you come across a lava pool.");
					String o6 = JOptionPane.showInputDialog("1: Smelt you iron   2: Leave it be");
					
					if (o6.equals("1")) {
						JOptionPane.showMessageDialog(null, "You start smelting your iron, and finally have enough for a bucket. Lucky for you, there is water nearby.");
						JOptionPane.showMessageDialog(null, "You grab the water and finish the portal. You get gravel to make a flint and steel and light the portal. Scared to die, you put all you stuff in a chest, and all you have in your inventory is 2 diamonds and a flint and steel");
						JOptionPane.showMessageDialog(null, "Not sure of your decision, you rethink this.");
						JOptionPane.showMessageDialog(null, "Do you want to go to the nether, or go explore the surface.");
						String o15 = JOptionPane.showInputDialog("1: Go to the nether   2: Go to the surface.");
						
						if (o15.equals("1")) {
						JOptionPane.showMessageDialog(null, "You enter the portal and start walking, but all of a sudden you are knocked of the cliff by a ghast.");
						String o7 = JOptionPane.showInputDialog("1: Accept your fate   2: (TIME DELAY) Use the ender pearl.");
						
						if (o7.equals("2")) {
							JOptionPane.showMessageDialog(null, "You use your quick thinking and throw the ender pearl, managing to save yourself.");
							JOptionPane.showMessageDialog(null, "But you didn't think fast enough, and accidently enderpearl right on top of a blaze spawner.");
							JOptionPane.showMessageDialog(null, "Suddenly multiple fireballs come flying towards you.");
							String o8 = JOptionPane.showInputDialog("1: Fight them off with your pickaxe   2: Run");
							
							if (o8.equals("2")) {
								JOptionPane.showMessageDialog(null, "You run for your life, trying to escape the fiery monsters.");
								JOptionPane.showMessageDialog(null, "Suddenly, an idea pops into your head. Immediately, you hide behind a zombified piglin.");
								JOptionPane.showMessageDialog(null, "The pig charges after the blaze in a rage after being hit by one of fireballs");
								JOptionPane.showMessageDialog(null, "The pig manages to kill many of the blazes before being taken out");
								JOptionPane.showMessageDialog(null, "You get ready to run, but notice that the pig left many blaze rods on the ground");
								String o9 = JOptionPane.showInputDialog("1: Go for the blaze rods   2: Leave then behind");
								
								if (o9.equals("1")) {
									JOptionPane.showMessageDialog(null, "You quickly run and grab the blaze rods, and then turn around run.");
									JOptionPane.showMessageDialog(null, "You find the portal, and start angling yourself towards it, but then realize that there is a bastion nearby.");
									JOptionPane.showMessageDialog(null, "You also notice a ghast nearby, that is about to launch its explosive flaming missile.");
									String o10 = JOptionPane.showInputDialog("1: Go for the portal   2: Go for the bastion");
									
									//if B, ghast shoots you while going to the bastion, and you end up dying
									
									if (o10.equals("1")) {
										JOptionPane.showMessageDialog(null, "You make a run for run portal, but right as you make it, the ghast shatters the portal.");
										String o11 = JOptionPane.showInputDialog("1: Go for the Bastion   2: Go for the bastion");
										
										if (o11.equals("1") || o11.equals("2")) {
											JOptionPane.showMessageDialog(null, "You make a run for the bastion, but as your are almost there, the ghast fireball hits a pile of gold blocks.");
											JOptionPane.showMessageDialog(null, "Gold rains from above onto the piglins, and you are thrown hundreds of different items.");
											JOptionPane.showMessageDialog(null, "After seeing a pile items containing obsidian and ender pearls, you run towards it.");
											JOptionPane.showMessageDialog(null, "Not only do you obtain enough ender pearls for the strong hold, but you now have enough obsidian to make a portal.");
											String o12 = JOptionPane.showInputDialog("1: Make a Nether portal and escape   2: Say and collect the rest of the loot");
											
							 				if (o12.equals("1")) {
												JOptionPane.showMessageDialog(null, "You build the Nether portal, and escape.");
												JOptionPane.showMessageDialog(null, "And then, you see the most amazing thing ever.");
												JOptionPane.showMessageDialog(null, "You spawned at the strong hold.");
												String o13 = JOptionPane.showInputDialog("1: Go get more materials   2: Go find the portal");
												
												if (o13.equals("2")) {
												JOptionPane.showMessageDialog(null, "While knowing that you don't have nearly enough materials the fight the Ender Dragon, you start looking for the portal room.");
												JOptionPane.showMessageDialog(null, "But then, an idea hits your head. You have enough diamonds to make a diamond sword.");
												JOptionPane.showMessageDialog(null, "Libraries in the stronghold contain cobweb.");
												JOptionPane.showMessageDialog(null, "Cobweb drops string.");
												JOptionPane.showMessageDialog(null, "String can be crafted into wool.");
												JOptionPane.showMessageDialog(null, "Wool can be crafted into beds.");
												JOptionPane.showMessageDialog(null, "And beds explode in the End.");
												JOptionPane.showMessageDialog(null, "You were wrong, you do have enough materials to beat the Ender Dragon.");
												String o14 = JOptionPane.showInputDialog("1: Get beds   2: Go into the portal with what you have now");
												
												if (o14.equals("1")) {
													JOptionPane.showMessageDialog(null, "You get beds, and are now ready to fight the Ender Dragon.");
													JOptionPane.showMessageDialog(null, "You jump into the End portal, and make your way to the center.");
													JOptionPane.showMessageDialog(null, "To win you have to time all four beds perfectly.");
													JOptionPane.showMessageDialog(null, "Only tap when the screen is green.");

													//stays showing a Video called explode the bed for 3 sec, goes to a video called explode the bed for 0.5 seconds while the screen is green, then goes back to a video called explode the bed for 3 seconds while the screen is normal color
													JOptionPane.showMessageDialog(null, "You Win");
															
													}
												}
							 				}
										}
									}
								}
							}
						}
					}	
						//do here thingy
				}	
					if (o6.equals("2")) {
						JOptionPane.showMessageDialog(null, "You leave the lava pool be, it's way too dangerous to stay.");
						JOptionPane.showMessageDialog(null, "You find a safe place to stay. You get your furnace out. You start smelting iron.");
						JOptionPane.showMessageDialog(null, "However, you get interupted by a creeper. Do you want to jump out of the way, or stay and save your iron");	
						String o20 = JOptionPane.showInputDialog("1: Save yourself   2: Save your iron");

						JOptionPane.showMessageDialog(null, "!!!continue!!! o20 1");
						
						if (o20.equals("2")) {
							JOptionPane.showMessageDialog(null, "You try to save your iron. You successfully get all yor iron out, but the creeper explodes.");
							JOptionPane.showMessageDialog(null, "You are now on 2 hearts, and have to be cearful. You have 9 iron ingots, only have 1 stick, but you dont know what to do with them.");
							JOptionPane.showMessageDialog(null, "Your iron pickaxe is low, and you dont have enough duriblity to make another furnace. You can only break 2 more blocks.");	
							String o21 = JOptionPane.showInputDialog("1: Iron sword/bucket   2: Iron boots,helmet   3: Save it");

							if (o21.equals("1")) {
								JOptionPane.showMessageDialog(null, "You decide to make a sword and a bucket, if your in a sticky siduation, you would rather fight it out.");
								JOptionPane.showMessageDialog(null, "And a bucket, just in case of emergency.");
								JOptionPane.showMessageDialog(null, "Do you want to go fight zombies and get food, or keep going deeper.");
								String o22 = JOptionPane.showInputDialog("1: Fight zombies   2: Go deeper");

								if (o22.equals("1")) {
									JOptionPane.showMessageDialog(null, "You decide to fight zombies, you have to be very careful not to die.");
									JOptionPane.showMessageDialog(null, "Due to zombies having better sight, you lure them twardsd you and kill them.");
									JOptionPane.showMessageDialog(null, "Because of the hunger effect, you only heal up to 3 hearts.");
									JOptionPane.showMessageDialog(null, "You decide that its too dangerous, and you need to get back up.");
									JOptionPane.showMessageDialog(null, "Do you want to keep killing zombies, make a run for it, or use your ender pearl.");
									String o25 = JOptionPane.showInputDialog("1: Keep killing zombies   2: Make a run for it   3: Enderpearl");
									
									if (o25.equals("1")) {
									JOptionPane.showMessageDialog(null, "You decide to keep killing zombies, you think its too risky being on low health");
									JOptionPane.showMessageDialog(null, "While killing zombies, a nearby skeleton sees you, and shoots");
									JOptionPane.showMessageDialog(null, "You fall down into a pit of zombies");
									JOptionPane.showMessageDialog(null, "Do you want to fight you way out, run away, or block yourself in");
									String o26 = JOptionPane.showInputDialog("1: Fight   2: Run   3: Block yourself in");

									if (o26.equals("1")) {
									JOptionPane.showMessageDialog(null, "You aren't going down without a fight");
									JOptionPane.showMessageDialog(null, "The zombies get a couple hits on you, but your able to kill a couple of them");
									JOptionPane.showMessageDialog(null, "But evreytime you kill one, two more join in");
									JOptionPane.showMessageDialog(null, "You are overwhelmed by the ammount of mobs, and accept your fate");
									
									JOptionPane.showMessageDialog(null, "DEATH");
									
									}
									
									if (o26.equals("2")) {
										JOptionPane.showMessageDialog(null, "You decide to make a run for it");
										JOptionPane.showMessageDialog(null, "You run down the cave, knowing going up is too risky");
										JOptionPane.showMessageDialog(null, "You find a revien, but its too dark to see any water");
										JOptionPane.showMessageDialog(null, "You turn around, and see zombies are coming. You have no other choice");
										JOptionPane.showMessageDialog(null, "You jump, not knowing whats down there");
										JOptionPane.showMessageDialog(null, " ");
										JOptionPane.showMessageDialog(null, "You land in water");
										JOptionPane.showMessageDialog(null, "You quickly get away, knowing that a any mob could be around the corner");
										JOptionPane.showMessageDialog(null, "You see some coal ore, and decide to mine it");
										JOptionPane.showMessageDialog(null, "With only one coal, and a stick, you make 4 torches.");
										JOptionPane.showMessageDialog(null, "You find yourself in a dead end, and with only 1 block left to mine");
										JOptionPane.showMessageDialog(null, "You see a hole in the wall, but cant see anything through it");
										JOptionPane.showMessageDialog(null, "Do you want to mine, and hope you get lucky, or look around for an exit");
										String o27 = JOptionPane.showInputDialog("1: Mine   2: Look for an exit");

										if (o27.equals("1")) {
											JOptionPane.showMessageDialog(null, "You mine the block, but see that there is only more blocks in the way, without a pickaxe, you feel like giving up");
											JOptionPane.showMessageDialog(null, "You turn around, and see a creeper");
											JOptionPane.showMessageDialog(null, "In a moment of shock, you run through it, and punch it");
											JOptionPane.showMessageDialog(null, "You managed to get far enough away, and didn't take any damage, but the creeper exploded the wall");
											JOptionPane.showMessageDialog(null, "You walk forward to get a closer look, and see something");
											JOptionPane.showMessageDialog(null, "A Mineshaft!");
											JOptionPane.showMessageDialog(null, "You find a safe way to get down, and you start getting wood");
											JOptionPane.showMessageDialog(null, "You see a chest minecart, but right next to it is a cave spider spawner");
											JOptionPane.showMessageDialog(null, "Do you want to risk it for the chest minecraft, or leave it behind and get to a safe place");
											String o28 = JOptionPane.showInputDialog("1: Risk it   2: Leave it");

											
											
											if (o28.equals("1")) {
												JOptionPane.showMessageDialog(null, "You decide to risk it");
												JOptionPane.showMessageDialog(null, "You make a run for it, catching the sight of multple spiders");
												JOptionPane.showMessageDialog(null, "They come after you, but your faster");
												JOptionPane.showMessageDialog(null, "You open the chest, and see diamonds");
												JOptionPane.showMessageDialog(null, "You quickly take them and continue running, the spiders close behind.");
												JOptionPane.showMessageDialog(null, "You use wood to block yourself off");
												JOptionPane.showMessageDialog(null, "With a clear way around you quickly make a crafting table, and craft a sword");



												String o29 = JOptionPane.showInputDialog("1: Risk it   2: Leave it");

												JOptionPane.showMessageDialog(null, "!!!continue!!! o28 2");

											
										}
										
										JOptionPane.showMessageDialog(null, "!!!continue!!! o27 3");
										
									}
									if (o26.equals("3")) {
									JOptionPane.showMessageDialog(null, "You decide to block yourself in");
									JOptionPane.showMessageDialog(null, "They try to sneak in, but you punch them back and manage to be safe");
									JOptionPane.showMessageDialog(null, "You decide to open a little hold on the bottom");
									JOptionPane.showMessageDialog(null, "You start to kill zombies, and get rotten flesh to heal");
									JOptionPane.showMessageDialog(null, "But a baby zombie comes in, and you die");
									
									JOptionPane.showMessageDialog(null, "DEATH");

									}									

									
									JOptionPane.showMessageDialog(null, "!!!continue!!! o25 2");

									
									}
									
									if (o25.equals("2")) {
										JOptionPane.showMessageDialog(null, "You decide to make a run for it");
										JOptionPane.showMessageDialog(null, "You get hit by a skeleton, and get to half a heart");
										JOptionPane.showMessageDialog(null, "Out of nowhere, another skeleton comes in, and shoots you");
										
										JOptionPane.showMessageDialog(null, "DEATH");
										
										///===DEATH===///

									}
									
									JOptionPane.showMessageDialog(null, "!!!continue!!! o25 3");
									
								}	
								
								
								if (o22.equals("2")) {
									JOptionPane.showMessageDialog(null, "You decide to go deeper");
									JOptionPane.showMessageDialog(null, "You make a run for it, but you get hit by a skeleton and zombie");
									JOptionPane.showMessageDialog(null, "You are now on half a heart, and don't know what to do");
									JOptionPane.showMessageDialog(null, "You keep going down the cave, but find a revien");
									JOptionPane.showMessageDialog(null, "You hear something, look up, and see a skeleton");
									JOptionPane.showMessageDialog(null, "You jump down the revien, but get hit by an arrow before you can make it to the bottom");

									JOptionPane.showMessageDialog(null, "DEATH");

									///===DEATH===///

								}

									
							}
								if (o21.equals("2")) {
									JOptionPane.showMessageDialog(null, "You decide to make armor, you would rather be safe.");
									JOptionPane.showMessageDialog(null, "You look over towards all the mobs, and decide that its too dangerous to stay, so you decide to go back to the surface.");
									JOptionPane.showMessageDialog(null, "Do you want to make a run for it, or use your enderpearl");
									String o23 = JOptionPane.showInputDialog("1: Make a run for it   2: Enderpearl");
									
									JOptionPane.showMessageDialog(null, "!!!continue!!! o23 1");
									
									if (o23.equals("2")) {
										JOptionPane.showMessageDialog(null, "You decide to enderpearl.");
										JOptionPane.showMessageDialog(null, "You make a perfect shot, but land on one heart and a half.");
										JOptionPane.showMessageDialog(null, "You make a run for it, but get shot by a skeleton.");
										JOptionPane.showMessageDialog(null, "Luckly, you have armor, and you survive on half of a heart, and get back to saftey");
										JOptionPane.showMessageDialog(null, "However its night, and you need food.");
										JOptionPane.showMessageDialog(null, "Do you want to hide until day, or kill zombies to get food");
										String o26 = JOptionPane.showInputDialog("1: Hide until day   2: Kill zombies");
										
										
									}

								}
									if (o21.equals("3")) {
										JOptionPane.showMessageDialog(null, "You decide to save your iron.");
										JOptionPane.showMessageDialog(null, "Just in case you get more later, you can make a chestplate.");
										JOptionPane.showMessageDialog(null, "Your in a bad position, and want to go back to the surface.");
										JOptionPane.showMessageDialog(null, "Do you want to run for it, or use your ender pearl.");
										String o27 = JOptionPane.showInputDialog("1: Run for it   2: Enderpearl");

										
										if (o27.equals("1")) {
											JOptionPane.showMessageDialog(null, "You decide to run for it.");
											JOptionPane.showMessageDialog(null, "You get hit by a skeleton, and end up on half a heart");
											JOptionPane.showMessageDialog(null, "You make it to a dead end, and se a spider quickly coming towards you");
											String o28 = JOptionPane.showInputDialog("1: Run for it   2: Enderpearl");

											JOptionPane.showMessageDialog(null, "!!!continue!!! o28 1,2");
											
										}
										
										
										if (o27.equals("2")) {
											JOptionPane.showMessageDialog(null, "You decide to enderpearl.");
											JOptionPane.showMessageDialog(null, "You make a perfect shot, and land on a half of heart.");
											JOptionPane.showMessageDialog(null, "Do you want to keep running, or look for a safe spot.");
											String o28 = JOptionPane.showInputDialog("1: Run for it   2: Look for a safe spot");

											JOptionPane.showMessageDialog(null, "!!!continue!!! o28 1,2");

											
										}
										


									}

						}
			}	
			
		
				}
				
				if (o5.equals("2")) {
					JOptionPane.showMessageDialog(null, "You decide to continue exploring.");
					JOptionPane.showMessageDialog(null, "After a while, you run out of hunger. On top of that, you havent found anything worth stoping for");
					JOptionPane.showMessageDialog(null, "While in a desert, you get ambushed by mods. You can't run, so you have to fight");
					JOptionPane.showMessageDialog(null, "After getting hit by husks, you start starving. You are cornered by a sand mountian, and realize its the end");
					JOptionPane.showMessageDialog(null, "But in a 500iq clutch, you block yourself off. Now at half a heart, you decide to wait until day.");
					JOptionPane.showMessageDialog(null, "Once its day, you look around for animals. You manage to get chicken. You cook it and get to full hunger.");
					JOptionPane.showMessageDialog(null, "You look around more, and find another village");
					JOptionPane.showMessageDialog(null, "You get more obisidan, and you make a nether portal. You find some gravel, and light the portal.");
					JOptionPane.showMessageDialog(null, "You decide you have nothing else to lose, and you go through it");

					JOptionPane.showMessageDialog(null, "!!!continue!!!");

				
				}


			}
			
			if (o4.equals("2")) {
				JOptionPane.showMessageDialog(null, "You decide to leave the stuff there... for some reason.");
				JOptionPane.showMessageDialog(null, "!!!continue!!!");
			}

	}	
	
		}
	if (o2.equals("1")) {
		JOptionPane.showMessageDialog(null, "You decide to explore the cave, and after exploring, you find a ruined portal.");
		JOptionPane.showMessageDialog(null, "While looking around, you find a mineshaft");
		JOptionPane.showMessageDialog(null, "You find 2 diamonds and continue looking around.");
		JOptionPane.showMessageDialog(null, "You decide that its not worth it to go the the nether");
		JOptionPane.showMessageDialog(null, "You see an opening above you, but cant see anything in it");
		JOptionPane.showMessageDialog(null, "You decide to get some more blocks, and build up");

		JOptionPane.showMessageDialog(null, "!!!continue!!!");
		
	}

		
		

	
				
		}
	
if (o1.equals("2")) {
	JOptionPane.showMessageDialog(null, "You decide to get wood. You go to a tree, get wood, turn it into planks.");
	JOptionPane.showMessageDialog(null, "do you want to make tools and a crafting table, or save your wood.");
	String o16 = JOptionPane.showInputDialog("1: Make tools   2: Save");
	
		if (o16.equals("1")) {
			JOptionPane.showMessageDialog(null, "You decide to make tools. You make a wooden sword and pickaxe.");
			JOptionPane.showMessageDialog(null, "You see a cave near by.");
			String o17 = JOptionPane.showInputDialog("1: Enter the cave   2: Get more wood");
						
				if (o17.equals("1")) {
				JOptionPane.showMessageDialog(null, "Because of the deep hole blocking your path, you bridge over.");
				JOptionPane.showMessageDialog(null, "You realize that you used all of your planks");
				JOptionPane.showMessageDialog(null, "You walk through the cave, realizing you have nothing else in your inventory.");
				JOptionPane.showMessageDialog(null, "But you start regretting your decision.");
				JOptionPane.showMessageDialog(null, "Do you want explore the outside world, or go back down the cave.");
				String o18 = JOptionPane.showInputDialog("1: Explore   2: Go back down the cave");
						
				
				if (o18.equals("1")) {
				JOptionPane.showMessageDialog(null, "GO TO O1");

				}
				
				if (o18.equals("2")) {
				JOptionPane.showMessageDialog(null, "You go back down the cave, and look around. You accedently fall into a cave full of monsters, and die");
				JOptionPane.showMessageDialog(null, "DEATH");

				}
				}
		
				if (o17.equals("2")) {
				JOptionPane.showMessageDialog(null, "You get more wood. Now, you have enough for a full set of tools and a stack extra.");
				String o19 = JOptionPane.showInputDialog("1: Explore the cave   2: Explore the land around you");

							
						if (o19.equals("1")) {
						JOptionPane.showMessageDialog(null, "You go back down the cave, and end up finding some diamonds.");
						JOptionPane.showMessageDialog(null, "You walk twords them, and start hearing a strange noise");
						JOptionPane.showMessageDialog(null, "You turm around to see a creeper blow you up, and kill you.");

							///===DEATH===///
						JOptionPane.showMessageDialog(null, "DEATH");
					}
				}
		}
		
		
		if (o16.equals("2")) {
			JOptionPane.showMessageDialog(null, "You decide to save your wood, you can always craft it later.");
			JOptionPane.showMessageDialog(null, "You see a cave near by, and decide to go in it.");
			JOptionPane.showMessageDialog(null, "Because of the deep hole blocking your path, you craft you wood into planks and bridge over.");
			JOptionPane.showMessageDialog(null, "You realize that you used all of your planks");
			JOptionPane.showMessageDialog(null, "You walk through the cave, realizing you have nothing else in your inventory.");
			JOptionPane.showMessageDialog(null, "But you start regretting your decision.");
			JOptionPane.showMessageDialog(null, "Do you want explore the outside world, or go back down the cave.");
			String o18 = JOptionPane.showInputDialog("1: Explore   2: Go back down the cave");
			
			if (o18.equals("1")) {
			JOptionPane.showMessageDialog(null, "RETURN TO O1");
			
			}
			
			if (o18.equals("2")) {
			JOptionPane.showMessageDialog(null, "You go back down the cave, and look around. You accedently fall into a cave full of monsters");
			JOptionPane.showMessageDialog(null, "Your low health, but see an exit in front of you and behind you");
			JOptionPane.showMessageDialog(null, "The one in front of you is a path way leading upwards, but its guarded by a lot of mobs");
			JOptionPane.showMessageDialog(null, "The one behind you is guarded by very little mobs, but it leads back down");
			String o19 = JOptionPane.showInputDialog("1: Follow the one in front of you   2: Follow the one behind you");

			if (o19.equals("1")) {
				JOptionPane.showMessageDialog(null, "You run to the one in front of you");
				JOptionPane.showMessageDialog(null, "You start punching mobs, but are quickly overwhelmed");
				String o20 = JOptionPane.showInputDialog("1: Follow the one in front of you   2: Follow the one behind you");

				
				if (o20.equals("1")) {
					JOptionPane.showMessageDialog(null, "");
					JOptionPane.showMessageDialog(null, "");
					String o21 = JOptionPane.showInputDialog("1: !!!   2: !!!");
					
					JOptionPane.showMessageDialog(null, "!!!continue!!!");

					}
				
				if (o20.equals("2")) {
					JOptionPane.showMessageDialog(null, "");
					JOptionPane.showMessageDialog(null, "");
					String o21 = JOptionPane.showInputDialog("1: !!!   2: !!!");
					
					JOptionPane.showMessageDialog(null, "!!!continue!!!");

					
					}
				
				}

	}
		

			
		}
}
	
		}

		
		
		
		

	
	
	}
	
	
//o1 B	If you save your wood, you go into the cave and use it all to bridge to the entrance. You choose either to explore, which sends you to o2, or you can go down the cave, and find a lava pool, and a creeper explodes and you fall into the lava and it kills you.

//o2 A	You decide to explore the cave, and after exploring, you find a ruined portal. You also find 2 diamonds while exploring a mineshaft. You have enough materials, and go to the nether. Which sends you to o6 (edit o6 into 2 parts with another option to enter the portal and go back to the surface.)


//o3 B	You decide to keep exploring, waiting until you find something good. Eventually, you find somewhere that looks vaguely familiar. You think for a little, and then realize where you are, you make it back to spawn. Sends you to o1




	/*
	if (o.equals("")) {
JOptionPane.showMessageDialog(null, ".");
String o = JOptionPane.showInputDialog("1:    2: ");
		
}
*/





