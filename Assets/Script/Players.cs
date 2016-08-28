using UnityEngine;
using System.Collections;

public class Players : MonoBehaviour {

	public Transform player1_input;
	public Transform player2_input;

	string Player1 = player1_input.GetComponent<UIInput>.text();
	string Player2 = player2_input.GetComponent<UIInput>.text();

	// Use this for initialization
	void Start () {
	
	}

	// Update is called once per frame
	void Update () {
		
	}
}
