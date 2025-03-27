package jogoJader.modelo;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Jogador {
	private int x,y;
	private int dx,dy;
	private Image Imagem;
	private int altura, largura;
	private List <Tiro> tiros;
	private boolean isVisivel;
	
	public Jogador() {
		this.x = 100;
		this.y = 100;
		isVisivel = true;
		
		tiros = new ArrayList<Tiro>();
		 
	}
	
	
	public void load() {
		ImageIcon referencia = new ImageIcon("res//AviãoNovo.png");
		Imagem = referencia.getImage();
		
		altura = Imagem.getHeight(null);
		largura = Imagem.getWidth(null);
	}
	
	public void update() {
		x += dx;
		y += dy;
		
	}
	
	public void tiroSimples() {
		this.tiros.add(new Tiro(x+largura, y + (altura/2)));
	}
	
	public Rectangle getBounds() {
		return new Rectangle (x,y,largura,altura);
		}
	
	public void keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if (codigo == KeyEvent.VK_SPACE) {
			tiroSimples();
		}
		
		if (codigo == KeyEvent.VK_UP) {
			dy=-5;
		}
		
		if (codigo == KeyEvent.VK_DOWN) {
			dy=5;
		}
		if (codigo == KeyEvent.VK_LEFT) {
			dx=-3;
		}
		if (codigo == KeyEvent.VK_RIGHT) {
			dx=3;
		}
		
	}
	
	public void keyRelease(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if (codigo == KeyEvent.VK_UP) {
			dy=0;
		}
		
		if (codigo == KeyEvent.VK_DOWN) {
			dy=0;
		}
		if (codigo == KeyEvent.VK_LEFT) {
			dx=0;
		}
		if (codigo == KeyEvent.VK_RIGHT) {
			dx=0;
		}
	
	}
	
	

	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return Imagem;
	}

	public List<Tiro> getTiros() {
		return tiros;
	}


	}



