
using UnityEngine;
using System.Collections;

public class Players : MonoBehaviour {

	public UIInput player1_input;
	public UIInput player2_input;

	public string Player1;
	public string Player2;

	// Use this for initialization
	void Start () {
		
	}

	// Update is called once per frame
	void Update () {
		
	}

	void OnClick(){
		Player1 = player1_input.GetComponent<UIInput> ().text;
		Player2 = player2_input.GetComponent<UIInput> ().text;
	}
}
