using System;
using Gtk;
using System.IO;
using System.Drawing;

public partial class MainWindow: Gtk.Window

{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}

	protected void OnBorrartodoClicked (object sender, System.EventArgs e)
	{
		textview2.Buffer.Text = "";
	}

	protected void OnMayusculasClicked (object sender, EventArgs e)
	{
		textview2.Buffer.Text = textview2.Buffer.Text.ToUpper ();
	}

	protected void OnMinusculasClicked (object sender, EventArgs e)
	{
		textview2.Buffer.Text = textview2.Buffer.Text.ToLower ();
	}

	protected void OnNegritaClicked (object sender, EventArgs e)
	{
		Pango.FontDescription font = new Pango.FontDescription ();
		font.Weight = Pango.Weight.Bold;
		textview2.ModifyFont (font); 
	}

	protected void OnCursivaClicked (object sender, EventArgs e)
	{
		Pango.FontDescription font = new Pango.FontDescription ();
		font.Style = Pango.Style.Italic;
		textview2.ModifyFont (font); 
	}

	protected void OnCerrarClicked (object sender, EventArgs e)
	{
		Application.Quit();
	}
}
