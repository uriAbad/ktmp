//
//  ContentView.swift
//  ktmp
//
//  Created by Oriol Abad on 22/07/2020.
//  Copyright © 2020 Oriol Abad. All rights reserved.
//

import SwiftUI
import SharedCode

struct ContentView: View {
    
    @State var text: String = CommonKt.createApplicationScreenMessage()

    var body: some View {
        Text(text).onAppear {
            KtorTestKt.getRequest(completionHandler: { data, error in
                self.text = data ?? "Lol no data"
            })
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
