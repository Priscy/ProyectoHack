using UnityEngine;
using System.Collections;

public class ButtonController : MonoBehaviour {

	public GameObject activate;
	public GameObject deactivate;

	public enum ScreenToGo {
		NONE=-1, START=0, PLAYERS=1, AR_SCREEN=2
	}

	public ScreenToGo nextScreen;
	public ScreenToGo previousScreen;
	private UIButton internalButton;

	// Use this for initialization
	void Start () {
	
	}
	
	// Update is called once per frame
	void Update () {
	
	}

	void OnEnable(){
		internalButton = GetComponentInChildren<UIButton> ();
		EventDelegate.Add (internalButton.onClick, onClickButton);
	}

	void onDisable(){
		EventDelegate.Remove (internalButton.onClick, onClickButton);
	}

	void onClickButton(){
		if (nextScreen == ScreenToGo.PLAYERS) {
			deactivate.SetActive (false);
			activate.SetActive (true);
		} else if (nextScreen == ScreenToGo.AR_SCREEN) {
			Application.LoadLevel("0.2AR");
		}
	}

}
