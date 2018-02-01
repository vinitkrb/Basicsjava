package com.vk.musicPlayer;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MusicTest1 
{
public void play() 
{
	try
	{
		
	
	Sequencer sequencer=MidiSystem.getSequencer();
	sequencer.open();
	Sequence seq=new Sequence(Sequence.PPQ,4);
	Track track=seq.createTrack();
	
	
	ShortMessage a=new ShortMessage();
	a.setMessage(144,1,102,100);
	MidiEvent noteOn = new MidiEvent(a, 1);
	track.add(noteOn);
	
	ShortMessage b=new ShortMessage();
	b.setMessage(128,1,102,100);
	MidiEvent noteoff=new MidiEvent(b,23);
	track.add(noteoff);
	
	sequencer.setSequence(seq);
	sequencer.start();
	
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
}
public static void main(String [] args)
{
	MusicTest1 m=new MusicTest1();
	m.play();
}
}
